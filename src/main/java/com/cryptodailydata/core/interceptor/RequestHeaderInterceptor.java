package com.cryptodailydata.core.interceptor;

import com.cryptodailydata.core.constant.LogHeaderValues;
import com.cryptodailydata.core.filter.CustomHttpServletRequestWrapper;
import com.cryptodailydata.log.AppThreadLocal;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author huseyin.poyraz at 9/12/2019
 */

@Slf4j
public class RequestHeaderInterceptor extends HandlerInterceptorAdapter
{
    @Autowired
    private LogHeaderValues loggingHeaderArray;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        settingBeans(request);
        CustomHttpServletRequestWrapper requestWrapper = new CustomHttpServletRequestWrapper(request);
        String requestUrl = requestWrapper.getRequestURI();

//        OHPLPRequestBodyModel plpRequestBodyModel = null;
//        if (requestUrl.contains("plp"))
//        {
//            plpRequestBodyModel = objectMapper.readValue(requestWrapper.getReader().lines().collect(Collectors.joining(System.lineSeparator())), OHPLPRequestBodyModel.class);
//        }

        // Todo-serhat: istenmeyen endpointler için içeri girmeyeyi sağlayan bir utility sınıfı yazılabilir.
        if (!request.getRequestURL().toString().contains("prometheus") && !request.getRequestURL().toString().contains("suggestion"))
        {
                AppThreadLocal.safeGet().setEndpoint(request.getRequestURL().toString());
                MDC.put("endpoint", AppThreadLocal.safeGet().getEndpoint());
                traceHeaders(request);
                traceParameters(request);
             //   log.info("req: {} ", AppThreadLocal.safeGet().getEndpoint());
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {

    }

    private void traceHeaders(HttpServletRequest request) throws IOException
    {
        Enumeration<String> headerNames = request.getHeaderNames();
        if (headerNames.hasMoreElements())
        {
//          log.info("************************ START - traceHeaders ************************* ");
            while (headerNames.hasMoreElements())
            {
                String headerName = headerNames.nextElement();
                boolean contains = true;
                //    Arrays.stream(loggingHeaderArray.getHeadervalues().toArray()).anyMatch(headerName::equals);
                if (contains)
                {
                    MDC.put(headerName, request.getHeader(headerName));
                }
//                log.info("Header Name - " + headerName + ", Value - " + request.getHeader(headerName));
            }
//           log.info("************************ END - traceHeaders ************************* ");
//           log.info("");
        }
    }

    private void traceParameters(HttpServletRequest request) throws IOException
    {
        Enumeration<String> params = request.getParameterNames();

        if (params.hasMoreElements())
        {
            //        log.info("************************ START - traceParameters ************************* ");
            while (params.hasMoreElements())
            {
                String paramName = params.nextElement();
                MDC.put(paramName, request.getHeader(paramName));
                //   log.info("Parameter Name - " + paramName + ", Value - " + request.getParameter(paramName));
            }
            //          log.info("************************ END - traceParameters ************************* ");
            //          log.info("");
        }
    }

    private void settingBeans(ServletRequest request)
    {
        ServletContext servletContext = request.getServletContext();
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        assert webApplicationContext != null;
        loggingHeaderArray = webApplicationContext.getBean(LogHeaderValues.class);
        objectMapper = webApplicationContext.getBean(ObjectMapper.class);
    }

}
