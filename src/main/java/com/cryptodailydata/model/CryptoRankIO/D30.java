
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
    "USD",
    "BTC",
    "ETH"
})
@Generated("jsonschema2pojo")
public class D30 {

    @JsonProperty("USD")
    private Double usd;
    @JsonProperty("BTC")
    private Integer btc;
    @JsonProperty("ETH")
    private Double eth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("USD")
    public Double getUsd() {
        return usd;
    }

    @JsonProperty("USD")
    public void setUsd(Double usd) {
        this.usd = usd;
    }

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
