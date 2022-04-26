package com.cryptodailydata.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "ohurl")
public class URLConstants
{
    private Solr solr = new Solr();
    private Wsc wsc = new Wsc();
    private Dev dev = new Dev();
    private WebviewUrl webviewUrl = new WebviewUrl();
    private String prefixBaseUrl;
    private String restVersion;
    private String tokenEndpoint;
    private String baseSite;
    private String baseSiteWithoutRest;
    private String pdpShareUrl;
    private String noImage;
    private String videoIcon;
    private String shoppingBagId;
    private String personalinfo;
    private String sizeTableUrl;
    private String sapSizeTableUrl;
    private String langId;
    private String sapSiteUrl;

    @Data
    public static class Solr
    {
        private String baseurl;
    }

    @Data
    public static class Wsc
    {
        private String baseurl;
    }

    @Data
    public static class WebviewUrl
    {
        private String baseurl;
        private String contactUsUrl;
    }

    @Data
    public static class Dev
    {
        private String baseurl;
    }

}