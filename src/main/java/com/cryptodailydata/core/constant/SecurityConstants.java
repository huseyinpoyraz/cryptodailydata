package com.cryptodailydata.core.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "securityconstants")
public class SecurityConstants
{
    private String androidClientId;
    private String androidClientSecret;
    private String iosClientId;
    private String iosClientSecret;
    private String vendorBasicAuthForAndroid;
    private String vendorBasicAuthForIOS;

    private String vendorAndroidClientId;
    private String vendorIOSClientId;
    private String vendorAndroidClientSecret;
    private String vendorIOSClientSecret;
    private String vendorWEBClientId;
    private String vendorWEBClientSecret;

    private String accessTokenExpireTime;
    private String refreshTokenExpireTime;
    private String realm;
    private String tokenUrl;
    private String defaultUsername;
    private String defaultRole;
    private String encryptionSalt;
    private String encryptionPassword;
    private String adminClientId;
    private String adminRole;
    private String maintenanceStatusCode;
}
