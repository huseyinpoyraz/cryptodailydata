
package com.cryptodailydata.model.CryptoRankIO;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BTC",
    "ETH",
    "USD",
    "date",
    "dateETH",
    "marketCap"
})
@Generated("jsonschema2pojo")
public class AthPrice {

    @JsonProperty("BTC")
    private Integer btc;
    @JsonProperty("ETH")
    private Double eth;
    @JsonProperty("USD")
    private Double usd;
    @JsonProperty("date")
    private String date;
    @JsonProperty("dateETH")
    private String dateETH;
    @JsonProperty("marketCap")
    private Double marketCap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BTC")
    public Integer getBtc() {
        return btc;
    }

    @JsonProperty("BTC")
    public void setBtc(Integer btc) {
        this.btc = btc;
    }

    @JsonProperty("ETH")
    public Double getEth() {
        return eth;
    }

    @JsonProperty("ETH")
    public void setEth(Double eth) {
        this.eth = eth;
    }

    @JsonProperty("USD")
    public Double getUsd() {
        return usd;
    }

    @JsonProperty("USD")
    public void setUsd(Double usd) {
        this.usd = usd;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("dateETH")
    public String getDateETH() {
        return dateETH;
    }

    @JsonProperty("dateETH")
    public void setDateETH(String dateETH) {
        this.dateETH = dateETH;
    }

    @JsonProperty("marketCap")
    public Double getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
