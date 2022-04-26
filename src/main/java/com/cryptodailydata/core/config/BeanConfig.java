package com.cryptodailydata.core.config;

import com.cryptodailydata.core.interceptor.RequestHeaderInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.handler.MappedInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class BeanConfig
{
    @Bean
    public RestTemplate restTemplate()
    {
        RestTemplate rest = new RestTemplateBuilder().build();
        return rest;
    }

    @Bean
    public HttpHeaders httpHeaders()
    {
        return new HttpHeaders();
    }

    @Bean
    public ObjectMapper objectMapper()
    {
        return new ObjectMapper();
    }

}
