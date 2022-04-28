
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
    "id",
    "symbol",
    "address",
    "image_url",
    "name",
    "decimals",
    "eth_price",
    "usd_price"
})
@Generated("jsonschema2pojo")
public class PaymentToken {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("address")
    private String address;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("decimals")
    private Integer decimals;
    @JsonProperty("eth_price")
    private Double ethPrice;
    @JsonProperty("usd_price")
    private Double usdPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("decimals")
    public Integer getDecimals() {
        return decimals;
    }

    @JsonProperty("decimals")
    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }

    @JsonProperty("eth_price")
    public Double getEthPrice() {
        return ethPrice;
    }

    @JsonProperty("eth_price")
    public void setEthPrice(Double ethPrice) {
        this.ethPrice = ethPrice;
    }

    @JsonProperty("usd_price")
    public Double getUsdPrice() {
        return usdPrice;
    }

    @JsonProperty("usd_price")
    public void setUsdPrice(Double usdPrice) {
        this.usdPrice = usdPrice;
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
