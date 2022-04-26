
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
    "H24",
    "D30",
    "YTD",
    "M6",
    "M3",
    "Y1",
    "D7"
})
@Generated("jsonschema2pojo")
public class HistPrices {

    @JsonProperty("H24")
    private H24 h24;
    @JsonProperty("D30")
    private D30 d30;
    @JsonProperty("YTD")
    private Ytd ytd;
    @JsonProperty("M6")
    private M6 m6;
    @JsonProperty("M3")
    private M3 m3;
    @JsonProperty("Y1")
    private Y1 y1;
    @JsonProperty("D7")
    private D7 d7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("H24")
    public H24 getH24() {
        return h24;
    }

    @JsonProperty("H24")
    public void setH24(H24 h24) {
        this.h24 = h24;
    }

    @JsonProperty("D30")
    public D30 getD30() {
        return d30;
    }

    @JsonProperty("D30")
    public void setD30(D30 d30) {
        this.d30 = d30;
    }

    @JsonProperty("YTD")
    public Ytd getYtd() {
        return ytd;
    }

    @JsonProperty("YTD")
    public void setYtd(Ytd ytd) {
        this.ytd = ytd;
    }

    @JsonProperty("M6")
    public M6 getM6() {
        return m6;
    }

    @JsonProperty("M6")
    public void setM6(M6 m6) {
        this.m6 = m6;
    }

    @JsonProperty("M3")
    public M3 getM3() {
        return m3;
    }

    @JsonProperty("M3")
    public void setM3(M3 m3) {
        this.m3 = m3;
    }

    @JsonProperty("Y1")
    public Y1 getY1() {
        return y1;
    }

    @JsonProperty("Y1")
    public void setY1(Y1 y1) {
        this.y1 = y1;
    }

    @JsonProperty("D7")
    public D7 getD7() {
        return d7;
    }

    @JsonProperty("D7")
    public void setD7(D7 d7) {
        this.d7 = d7;
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
