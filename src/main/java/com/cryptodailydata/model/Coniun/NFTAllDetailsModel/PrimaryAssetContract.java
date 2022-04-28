
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
    "address",
    "asset_contract_type",
    "created_date",
    "name",
    "nft_version",
    "opensea_version",
    "owner",
    "schema_name",
    "symbol",
    "total_supply",
    "description",
    "external_link",
    "image_url",
    "default_to_fiat",
    "dev_buyer_fee_basis_points",
    "dev_seller_fee_basis_points",
    "only_proxied_transfers",
    "opensea_buyer_fee_basis_points",
    "opensea_seller_fee_basis_points",
    "buyer_fee_basis_points",
    "seller_fee_basis_points",
    "payout_address"
})
@Generated("jsonschema2pojo")
public class PrimaryAssetContract {

    @JsonProperty("address")
    private String address;
    @JsonProperty("asset_contract_type")
    private String assetContractType;
    @JsonProperty("created_date")
    private String createdDate;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nft_version")
    private String nftVersion;
    @JsonProperty("opensea_version")
    private Object openseaVersion;
    @JsonProperty("owner")
    private Integer owner;
    @JsonProperty("schema_name")
    private String schemaName;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("total_supply")
    private String totalSupply;
    @JsonProperty("description")
    private String description;
    @JsonProperty("external_link")
    private String externalLink;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("default_to_fiat")
    private Boolean defaultToFiat;
    @JsonProperty("dev_buyer_fee_basis_points")
    private Integer devBuyerFeeBasisPoints;
    @JsonProperty("dev_seller_fee_basis_points")
    private Integer devSellerFeeBasisPoints;
    @JsonProperty("only_proxied_transfers")
    private Boolean onlyProxiedTransfers;
    @JsonProperty("opensea_buyer_fee_basis_points")
    private Integer openseaBuyerFeeBasisPoints;
    @JsonProperty("opensea_seller_fee_basis_points")
    private Integer openseaSellerFeeBasisPoints;
    @JsonProperty("buyer_fee_basis_points")
    private Integer buyerFeeBasisPoints;
    @JsonProperty("seller_fee_basis_points")
    private Integer sellerFeeBasisPoints;
    @JsonProperty("payout_address")
    private String payoutAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("asset_contract_type")
    public String getAssetContractType() {
        return assetContractType;
    }

    @JsonProperty("asset_contract_type")
    public void setAssetContractType(String assetContractType) {
        this.assetContractType = assetContractType;
    }

    @JsonProperty("created_date")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created_date")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nft_version")
    public String getNftVersion() {
        return nftVersion;
    }

    @JsonProperty("nft_version")
    public void setNftVersion(String nftVersion) {
        this.nftVersion = nftVersion;
    }

    @JsonProperty("opensea_version")
    public Object getOpenseaVersion() {
        return openseaVersion;
    }

    @JsonProperty("opensea_version")
    public void setOpenseaVersion(Object openseaVersion) {
        this.openseaVersion = openseaVersion;
    }

    @JsonProperty("owner")
    public Integer getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    @JsonProperty("schema_name")
    public String getSchemaName() {
        return schemaName;
    }

    @JsonProperty("schema_name")
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("total_supply")
    public String getTotalSupply() {
        return totalSupply;
    }

    @JsonProperty("total_supply")
    public void setTotalSupply(String totalSupply) {
        this.totalSupply = totalSupply;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("external_link")
    public String getExternalLink() {
        return externalLink;
    }

    @JsonProperty("external_link")
    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("default_to_fiat")
    public Boolean getDefaultToFiat() {
        return defaultToFiat;
    }

    @JsonProperty("default_to_fiat")
    public void setDefaultToFiat(Boolean defaultToFiat) {
        this.defaultToFiat = defaultToFiat;
    }

    @JsonProperty("dev_buyer_fee_basis_points")
    public Integer getDevBuyerFeeBasisPoints() {
        return devBuyerFeeBasisPoints;
    }

    @JsonProperty("dev_buyer_fee_basis_points")
    public void setDevBuyerFeeBasisPoints(Integer devBuyerFeeBasisPoints) {
        this.devBuyerFeeBasisPoints = devBuyerFeeBasisPoints;
    }

    @JsonProperty("dev_seller_fee_basis_points")
    public Integer getDevSellerFeeBasisPoints() {
        return devSellerFeeBasisPoints;
    }

    @JsonProperty("dev_seller_fee_basis_points")
    public void setDevSellerFeeBasisPoints(Integer devSellerFeeBasisPoints) {
        this.devSellerFeeBasisPoints = devSellerFeeBasisPoints;
    }

    @JsonProperty("only_proxied_transfers")
    public Boolean getOnlyProxiedTransfers() {
        return onlyProxiedTransfers;
    }

    @JsonProperty("only_proxied_transfers")
    public void setOnlyProxiedTransfers(Boolean onlyProxiedTransfers) {
        this.onlyProxiedTransfers = onlyProxiedTransfers;
    }

    @JsonProperty("opensea_buyer_fee_basis_points")
    public Integer getOpenseaBuyerFeeBasisPoints() {
        return openseaBuyerFeeBasisPoints;
    }

    @JsonProperty("opensea_buyer_fee_basis_points")
    public void setOpenseaBuyerFeeBasisPoints(Integer openseaBuyerFeeBasisPoints) {
        this.openseaBuyerFeeBasisPoints = openseaBuyerFeeBasisPoints;
    }

    @JsonProperty("opensea_seller_fee_basis_points")
    public Integer getOpenseaSellerFeeBasisPoints() {
        return openseaSellerFeeBasisPoints;
    }

    @JsonProperty("opensea_seller_fee_basis_points")
    public void setOpenseaSellerFeeBasisPoints(Integer openseaSellerFeeBasisPoints) {
        this.openseaSellerFeeBasisPoints = openseaSellerFeeBasisPoints;
    }

    @JsonProperty("buyer_fee_basis_points")
    public Integer getBuyerFeeBasisPoints() {
        return buyerFeeBasisPoints;
    }

    @JsonProperty("buyer_fee_basis_points")
    public void setBuyerFeeBasisPoints(Integer buyerFeeBasisPoints) {
        this.buyerFeeBasisPoints = buyerFeeBasisPoints;
    }

    @JsonProperty("seller_fee_basis_points")
    public Integer getSellerFeeBasisPoints() {
        return sellerFeeBasisPoints;
    }

    @JsonProperty("seller_fee_basis_points")
    public void setSellerFeeBasisPoints(Integer sellerFeeBasisPoints) {
        this.sellerFeeBasisPoints = sellerFeeBasisPoints;
    }

    @JsonProperty("payout_address")
    public String getPayoutAddress() {
        return payoutAddress;
    }

    @JsonProperty("payout_address")
    public void setPayoutAddress(String payoutAddress) {
        this.payoutAddress = payoutAddress;
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
