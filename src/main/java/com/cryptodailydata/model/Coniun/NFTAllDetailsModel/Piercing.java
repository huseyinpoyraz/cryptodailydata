
package com.cryptodailydata.model.Coniun.NFTAllDetailsModel;

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
    "airpod",
    "hoop",
    "pearl"
})
@Generated("jsonschema2pojo")
public class Piercing {

    @JsonProperty("airpod")
    private Integer airpod;
    @JsonProperty("hoop")
    private Integer hoop;
    @JsonProperty("pearl")
    private Integer pearl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airpod")
    public Integer getAirpod() {
        return airpod;
    }

    @JsonProperty("airpod")
    public void setAirpod(Integer airpod) {
        this.airpod = airpod;
    }

    @JsonProperty("hoop")
    public Integer getHoop() {
        return hoop;
    }

    @JsonProperty("hoop")
    public void setHoop(Integer hoop) {
        this.hoop = hoop;
    }

    @JsonProperty("pearl")
    public Integer getPearl() {
        return pearl;
    }

    @JsonProperty("pearl")
    public void setPearl(Integer pearl) {
        this.pearl = pearl;
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
