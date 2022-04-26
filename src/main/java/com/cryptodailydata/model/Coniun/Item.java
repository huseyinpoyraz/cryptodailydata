
package com.cryptodailydata.model.Coniun;

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
    "cbox_token_id",
    "cbox_week_index",
    "item_type",
    "nft_collection_contract",
    "nft_collection_slug",
    "nft_token_id",
    "whitelist_collection_contract",
    "whitelist_collection_slug",
    "fragment_type",
    "fragment_amount",
    "claimed_by",
    "claim_data",
    "created_at",
    "updated_at",
    "user_id",
    "discord_username"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("cbox_token_id")
    private Integer cboxTokenId;
    @JsonProperty("cbox_week_index")
    private Integer cboxWeekIndex;
    @JsonProperty("item_type")
    private String itemType;
    @JsonProperty("nft_collection_contract")
    private Object nftCollectionContract;
    @JsonProperty("nft_collection_slug")
    private Object nftCollectionSlug;
    @JsonProperty("nft_token_id")
    private Object nftTokenId;
    @JsonProperty("whitelist_collection_contract")
    private Object whitelistCollectionContract;
    @JsonProperty("whitelist_collection_slug")
    private String whitelistCollectionSlug;
    @JsonProperty("fragment_type")
    private Object fragmentType;
    @JsonProperty("fragment_amount")
    private Object fragmentAmount;
    @JsonProperty("claimed_by")
    private String claimedBy;
    @JsonProperty("claim_data")
    private Object claimData;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("discord_username")
    private String discordUsername;
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

    @JsonProperty("cbox_token_id")
    public Integer getCboxTokenId() {
        return cboxTokenId;
    }

    @JsonProperty("cbox_token_id")
    public void setCboxTokenId(Integer cboxTokenId) {
        this.cboxTokenId = cboxTokenId;
    }

    @JsonProperty("cbox_week_index")
    public Integer getCboxWeekIndex() {
        return cboxWeekIndex;
    }

    @JsonProperty("cbox_week_index")
    public void setCboxWeekIndex(Integer cboxWeekIndex) {
        this.cboxWeekIndex = cboxWeekIndex;
    }

    @JsonProperty("item_type")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("item_type")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("nft_collection_contract")
    public Object getNftCollectionContract() {
        return nftCollectionContract;
    }

    @JsonProperty("nft_collection_contract")
    public void setNftCollectionContract(Object nftCollectionContract) {
        this.nftCollectionContract = nftCollectionContract;
    }

    @JsonProperty("nft_collection_slug")
    public Object getNftCollectionSlug() {
        return nftCollectionSlug;
    }

    @JsonProperty("nft_collection_slug")
    public void setNftCollectionSlug(Object nftCollectionSlug) {
        this.nftCollectionSlug = nftCollectionSlug;
    }

    @JsonProperty("nft_token_id")
    public Object getNftTokenId() {
        return nftTokenId;
    }

    @JsonProperty("nft_token_id")
    public void setNftTokenId(Object nftTokenId) {
        this.nftTokenId = nftTokenId;
    }

    @JsonProperty("whitelist_collection_contract")
    public Object getWhitelistCollectionContract() {
        return whitelistCollectionContract;
    }

    @JsonProperty("whitelist_collection_contract")
    public void setWhitelistCollectionContract(Object whitelistCollectionContract) {
        this.whitelistCollectionContract = whitelistCollectionContract;
    }

    @JsonProperty("whitelist_collection_slug")
    public String getWhitelistCollectionSlug() {
        return whitelistCollectionSlug;
    }

    @JsonProperty("whitelist_collection_slug")
    public void setWhitelistCollectionSlug(String whitelistCollectionSlug) {
        this.whitelistCollectionSlug = whitelistCollectionSlug;
    }

    @JsonProperty("fragment_type")
    public Object getFragmentType() {
        return fragmentType;
    }

    @JsonProperty("fragment_type")
    public void setFragmentType(Object fragmentType) {
        this.fragmentType = fragmentType;
    }

    @JsonProperty("fragment_amount")
    public Object getFragmentAmount() {
        return fragmentAmount;
    }

    @JsonProperty("fragment_amount")
    public void setFragmentAmount(Object fragmentAmount) {
        this.fragmentAmount = fragmentAmount;
    }

    @JsonProperty("claimed_by")
    public String getClaimedBy() {
        return claimedBy;
    }

    @JsonProperty("claimed_by")
    public void setClaimedBy(String claimedBy) {
        this.claimedBy = claimedBy;
    }

    @JsonProperty("claim_data")
    public Object getClaimData() {
        return claimData;
    }

    @JsonProperty("claim_data")
    public void setClaimData(Object claimData) {
        this.claimData = claimData;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("discord_username")
    public String getDiscordUsername() {
        return discordUsername;
    }

    @JsonProperty("discord_username")
    public void setDiscordUsername(String discordUsername) {
        this.discordUsername = discordUsername;
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
