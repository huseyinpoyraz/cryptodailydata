package com.cryptodailydata.core.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.util.*;

/**
 * @author serhat.akdeniz created at 12/31/2019
 */
@Slf4j
public class CustomHttpServletRequestWrapper extends HttpServletRequestWrapper
{
    private ByteArrayOutputStream cachedBytes;
    private HttpServletRequest wrapped;

    private Map<String, String[]> parameterMap;

    private Map<String, String> headerMap = new HashMap<>();

    public CustomHttpServletRequestWrapper(HttpServletRequest wrapped)
    {
        super(wrapped);
        this.wrapped = wrapped;
    }


    public void addHeader(String name, String value) {
        headerMap.put(name, value);
    }

    public void removeteHeader(String name) {
        headerMap.remove(name);
    }

    @Override
    public String getHeader(String name) {
        String headerValue = super.getHeader(name);
        if (headerMap.containsKey(name)) {
            headerValue = headerMap.get(name);
        }
        return headerValue;
    }

    @Override
    public Enumeration<String> getHeaderNames() {
        List<String> names = Collections.list(super.getHeaderNames());

        for (String name : headerMap.keySet()) {
            names.remove("host");
            names.remove("auth");
            names.add(name);
        }
        return Collections.enumeration(names);
    }

    @Override
    public Enumeration<String> getHeaders(String name) {
        List<String> values = Collections.list(super.getHeaders(name));
        if (headerMap.containsKey(name)) {
            values.add(headerMap.get(name));
        }
        return Collections.enumeration(values);
    }

    public void addParameter(String name, String value)
    {
        if (parameterMap == null)
        {
            parameterMap = new HashMap<>();
            parameterMap.putAll(wrapped.getParameterMap());
        }
        String[] values = parameterMap.get(name);
        if (values == null)
        {
            values = new String[0];
        }
        List<String> list = new ArrayList<>(1);
//        list.addAll(Arrays.asList(values)); // eski değeri de ekliyoruz all olduğu için.
        list.add(value);
        parameterMap.put(name, list.toArray(new String[0]));
    }

    @Override
    public String getParameter(String name)
    {
        if (parameterMap == null)
        {
            return wrapped.getParameter(name);
        }

        String[] strings = parameterMap.get(name);
        if (strings != null)
        {
            return strings[0];
        }
        return null;
    }

    @Override
    public Map<String, String[]> getParameterMap()
    {
        if (parameterMap == null)
        {
            return wrapped.getParameterMap();
        }

        return Collections.unmodifiableMap(parameterMap);
    }

    @Override
    public Enumeration<String> getParameterNames()
    {
        if (parameterMap == null)
        {
            return wrapped.getParameterNames();
        }

        return Collections.enumeration(parameterMap.keySet());
    }

    @Override
    public String[] getParameterValues(String name)
    {
        if (parameterMap == null)
        {
            return wrapped.getParameterValues(name);
        }
        return parameterMap.get(name);
    }

    @Override
    public ServletInputStream getInputStream() throws IOException
    {
        if (cachedBytes == null)
            cacheInputStream();

        return new CachedServletInputStream();
    }

    @Override
    public BufferedReader getReader() throws IOException{
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }

    private void cacheInputStream() throws IOException {
        /* Cache the inputstream in order to read it multiple times. For
         * convenience, I use apache.commons IOUtils
         */
        cachedBytes = new ByteArrayOutputStream();
        IOUtils.copy(super.getInputStream(), cachedBytes);
    }

    /* An inputstream which reads the cached request body */
    public class CachedServletInputStream extends ServletInputStream
    {
        private ByteArrayInputStream input;

        public CachedServletInputStream() {
            /* create a new input stream from the cached request body */
            input = new ByteArrayInputStream(cachedBytes.toByteArray());
        }

        @Override
        public boolean isFinished() {
            return input.available() == 0;
        }

        @Override
        public boolean isReady() {
            return true;
        }

        @Override
        public void setReadListener(ReadListener listener) {
            throw new RuntimeException("Not implemented");
        }

        @Override
        public int read() throws IOException {
            return input.read();
        }
    }
}
