package com.cryptodailydata.core.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "logconstants")
public class LogHeaderValues
{
    private List<String> headervalues;
    private int elapsedTimeConstant;
}
