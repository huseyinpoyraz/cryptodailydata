package com.cryptodailydata.log;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Serhat akdeniz
 */

@Data
public class AppRequestContext implements Serializable, Cloneable
{
    private String userId = "";
    private String username = "";
    private String endpoint = "";
    private String wcToken = "";
    private String wcTrustedToken = "";
    private String accessToken = "";
    private String platform = "";
    private String role = "";
    private String request = "";
    private String response = "";
    private long elapsedResponseTime;
    private Exception exception;
}