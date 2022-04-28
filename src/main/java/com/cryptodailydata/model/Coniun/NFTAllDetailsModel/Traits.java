
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
    "background",
    "body",
    "face",
    "hair",
    "head",
    "piercing"
})
@Generated("jsonschema2pojo")
public class Traits {

    @JsonProperty("background")
    private Background background;
    @JsonProperty("body")
    private Body body;
    @JsonProperty("face")
    private Face face;
    @JsonProperty("hair")
    private Hair hair;
    @JsonProperty("head")
    private Head head;
    @JsonProperty("piercing")
    private Piercing piercing;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("background")
    public Background getBackground() {
        return background;
    }

    @JsonProperty("background")
    public void setBackground(Background background) {
        this.background = background;
    }

    @JsonProperty("body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Body body) {
        this.body = body;
    }

    @JsonProperty("face")
    public Face getFace() {
        return face;
    }

    @JsonProperty("face")
    public void setFace(Face face) {
        this.face = face;
    }

    @JsonProperty("hair")
    public Hair getHair() {
        return hair;
    }

    @JsonProperty("hair")
    public void setHair(Hair hair) {
        this.hair = hair;
    }

    @JsonProperty("head")
    public Head getHead() {
        return head;
    }

    @JsonProperty("head")
    public void setHead(Head head) {
        this.head = head;
    }

    @JsonProperty("piercing")
    public Piercing getPiercing() {
        return piercing;
    }

    @JsonProperty("piercing")
    public void setPiercing(Piercing piercing) {
        this.piercing = piercing;
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
