
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
    "one_day_volume",
    "one_day_change",
    "one_day_sales",
    "one_day_average_price",
    "seven_day_volume",
    "seven_day_change",
    "seven_day_sales",
    "seven_day_average_price",
    "thirty_day_volume",
    "thirty_day_change",
    "thirty_day_sales",
    "thirty_day_average_price",
    "total_volume",
    "total_sales",
    "total_supply",
    "count",
    "num_owners",
    "average_price",
    "num_reports",
    "market_cap",
    "floor_price"
})
@Generated("jsonschema2pojo")
public class Stats {

    @JsonProperty("one_day_volume")
    private Double oneDayVolume;
    @JsonProperty("one_day_change")
    private Double oneDayChange;
    @JsonProperty("one_day_sales")
    private Double oneDaySales;
    @JsonProperty("one_day_average_price")
    private Double oneDayAveragePrice;
    @JsonProperty("seven_day_volume")
    private Double sevenDayVolume;
    @JsonProperty("seven_day_change")
    private Double sevenDayChange;
    @JsonProperty("seven_day_sales")
    private Double sevenDaySales;
    @JsonProperty("seven_day_average_price")
    private Double sevenDayAveragePrice;
    @JsonProperty("thirty_day_volume")
    private Double thirtyDayVolume;
    @JsonProperty("thirty_day_change")
    private Double thirtyDayChange;
    @JsonProperty("thirty_day_sales")
    private Double thirtyDaySales;
    @JsonProperty("thirty_day_average_price")
    private Double thirtyDayAveragePrice;
    @JsonProperty("total_volume")
    private Double totalVolume;
    @JsonProperty("total_sales")
    private Double totalSales;
    @JsonProperty("total_supply")
    private Double totalSupply;
    @JsonProperty("count")
    private Double count;
    @JsonProperty("num_owners")
    private Integer numOwners;
    @JsonProperty("average_price")
    private Double averagePrice;
    @JsonProperty("num_reports")
    private Integer numReports;
    @JsonProperty("market_cap")
    private Double marketCap;
    @JsonProperty("floor_price")
    private Double floorPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("one_day_volume")
    public Double getOneDayVolume() {
        return oneDayVolume;
    }

    @JsonProperty("one_day_volume")
    public void setOneDayVolume(Double oneDayVolume) {
        this.oneDayVolume = oneDayVolume;
    }

    @JsonProperty("one_day_change")
    public Double getOneDayChange() {
        return oneDayChange;
    }

    @JsonProperty("one_day_change")
    public void setOneDayChange(Double oneDayChange) {
        this.oneDayChange = oneDayChange;
    }

    @JsonProperty("one_day_sales")
    public Double getOneDaySales() {
        return oneDaySales;
    }

    @JsonProperty("one_day_sales")
    public void setOneDaySales(Double oneDaySales) {
        this.oneDaySales = oneDaySales;
    }

    @JsonProperty("one_day_average_price")
    public Double getOneDayAveragePrice() {
        return oneDayAveragePrice;
    }

    @JsonProperty("one_day_average_price")
    public void setOneDayAveragePrice(Double oneDayAveragePrice) {
        this.oneDayAveragePrice = oneDayAveragePrice;
    }

    @JsonProperty("seven_day_volume")
    public Double getSevenDayVolume() {
        return sevenDayVolume;
    }

    @JsonProperty("seven_day_volume")
    public void setSevenDayVolume(Double sevenDayVolume) {
        this.sevenDayVolume = sevenDayVolume;
    }

    @JsonProperty("seven_day_change")
    public Double getSevenDayChange() {
        return sevenDayChange;
    }

    @JsonProperty("seven_day_change")
    public void setSevenDayChange(Double sevenDayChange) {
        this.sevenDayChange = sevenDayChange;
    }

    @JsonProperty("seven_day_sales")
    public Double getSevenDaySales() {
        return sevenDaySales;
    }

    @JsonProperty("seven_day_sales")
    public void setSevenDaySales(Double sevenDaySales) {
        this.sevenDaySales = sevenDaySales;
    }

    @JsonProperty("seven_day_average_price")
    public Double getSevenDayAveragePrice() {
        return sevenDayAveragePrice;
    }

    @JsonProperty("seven_day_average_price")
    public void setSevenDayAveragePrice(Double sevenDayAveragePrice) {
        this.sevenDayAveragePrice = sevenDayAveragePrice;
    }

    @JsonProperty("thirty_day_volume")
    public Double getThirtyDayVolume() {
        return thirtyDayVolume;
    }

    @JsonProperty("thirty_day_volume")
    public void setThirtyDayVolume(Double thirtyDayVolume) {
        this.thirtyDayVolume = thirtyDayVolume;
    }

    @JsonProperty("thirty_day_change")
    public Double getThirtyDayChange() {
        return thirtyDayChange;
    }

    @JsonProperty("thirty_day_change")
    public void setThirtyDayChange(Double thirtyDayChange) {
        this.thirtyDayChange = thirtyDayChange;
    }

    @JsonProperty("thirty_day_sales")
    public Double getThirtyDaySales() {
        return thirtyDaySales;
    }

    @JsonProperty("thirty_day_sales")
    public void setThirtyDaySales(Double thirtyDaySales) {
        this.thirtyDaySales = thirtyDaySales;
    }

    @JsonProperty("thirty_day_average_price")
    public Double getThirtyDayAveragePrice() {
        return thirtyDayAveragePrice;
    }

    @JsonProperty("thirty_day_average_price")
    public void setThirtyDayAveragePrice(Double thirtyDayAveragePrice) {
        this.thirtyDayAveragePrice = thirtyDayAveragePrice;
    }

    @JsonProperty("total_volume")
    public Double getTotalVolume() {
        return totalVolume;
    }

    @JsonProperty("total_volume")
    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    @JsonProperty("total_sales")
    public Double getTotalSales() {
        return totalSales;
    }

    @JsonProperty("total_sales")
    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    @JsonProperty("total_supply")
    public Double getTotalSupply() {
        return totalSupply;
    }

    @JsonProperty("total_supply")
    public void setTotalSupply(Double totalSupply) {
        this.totalSupply = totalSupply;
    }

    @JsonProperty("count")
    public Double getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Double count) {
        this.count = count;
    }

    @JsonProperty("num_owners")
    public Integer getNumOwners() {
        return numOwners;
    }

    @JsonProperty("num_owners")
    public void setNumOwners(Integer numOwners) {
        this.numOwners = numOwners;
    }

    @JsonProperty("average_price")
    public Double getAveragePrice() {
        return averagePrice;
    }

    @JsonProperty("average_price")
    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    @JsonProperty("num_reports")
    public Integer getNumReports() {
        return numReports;
    }

    @JsonProperty("num_reports")
    public void setNumReports(Integer numReports) {
        this.numReports = numReports;
    }

    @JsonProperty("market_cap")
    public Double getMarketCap() {
        return marketCap;
    }

    @JsonProperty("market_cap")
    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("floor_price")
    public Double getFloorPrice() {
        return floorPrice;
    }

    @JsonProperty("floor_price")
    public void setFloorPrice(Double floorPrice) {
        this.floorPrice = floorPrice;
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
