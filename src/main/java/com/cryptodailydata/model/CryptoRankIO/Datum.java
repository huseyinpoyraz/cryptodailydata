
package com.cryptodailydata.model.CryptoRankIO;

import java.util.HashMap;
import java.util.List;
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
    "rank",
    "key",
    "name",
    "symbol",
    "type",
    "marketCap",
    "availableSupply",
    "maxSupply",
    "totalSupply",
    "icon",
    "image",
    "tokens",
    "category",
    "categoryId",
    "volume24h",
    "price",
    "histPrices",
    "athPrice",
    "volatility"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("key")
    private String key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("type")
    private String type;
    @JsonProperty("marketCap")
    private Double marketCap;
    @JsonProperty("availableSupply")
    private Long availableSupply;
    @JsonProperty("maxSupply")
    private Long maxSupply;
    @JsonProperty("totalSupply")
    private Long totalSupply;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("image")
    private String image;
    @JsonProperty("tokens")
    private List<Object> tokens = null;
    @JsonProperty("category")
    private String category;
    @JsonProperty("categoryId")
    private Integer categoryId;
    @JsonProperty("volume24h")
    private Double volume24h;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("histPrices")
    private HistPrices histPrices;
    @JsonProperty("athPrice")
    private AthPrice athPrice;
    @JsonProperty("volatility")
    private Volatility volatility;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("marketCap")
    public Double getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("availableSupply")
    public Long getAvailableSupply() {
        return availableSupply;
    }

    @JsonProperty("availableSupply")
    public void setAvailableSupply(Long availableSupply) {
        this.availableSupply = availableSupply;
    }

    @JsonProperty("maxSupply")
    public Long getMaxSupply() {
        return maxSupply;
    }

    @JsonProperty("maxSupply")
    public void setMaxSupply(Long maxSupply) {
        this.maxSupply = maxSupply;
    }

    @JsonProperty("totalSupply")
    public Long getTotalSupply() {
        return totalSupply;
    }

    @JsonProperty("totalSupply")
    public void setTotalSupply(Long totalSupply) {
        this.totalSupply = totalSupply;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("tokens")
    public List<Object> getTokens() {
        return tokens;
    }

    @JsonProperty("tokens")
    public void setTokens(List<Object> tokens) {
        this.tokens = tokens;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("categoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    @JsonProperty("categoryId")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("volume24h")
    public Double getVolume24h() {
        return volume24h;
    }

    @JsonProperty("volume24h")
    public void setVolume24h(Double volume24h) {
        this.volume24h = volume24h;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("histPrices")
    public HistPrices getHistPrices() {
        return histPrices;
    }

    @JsonProperty("histPrices")
    public void setHistPrices(HistPrices histPrices) {
        this.histPrices = histPrices;
    }

    @JsonProperty("athPrice")
    public AthPrice getAthPrice() {
        return athPrice;
    }

    @JsonProperty("athPrice")
    public void setAthPrice(AthPrice athPrice) {
        this.athPrice = athPrice;
    }

    @JsonProperty("volatility")
    public Volatility getVolatility() {
        return volatility;
    }

    @JsonProperty("volatility")
    public void setVolatility(Volatility volatility) {
        this.volatility = volatility;
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
