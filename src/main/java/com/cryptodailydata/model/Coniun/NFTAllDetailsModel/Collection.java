
package com.cryptodailydata.model.Coniun.NFTAllDetailsModel;

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
    "editors",
    "payment_tokens",
    "primary_asset_contracts",
    "traits",
    "stats",
    "banner_image_url",
    "chat_url",
    "created_date",
    "default_to_fiat",
    "description",
    "dev_buyer_fee_basis_points",
    "dev_seller_fee_basis_points",
    "discord_url",
    "display_data",
    "external_url",
    "featured",
    "featured_image_url",
    "hidden",
    "safelist_request_status",
    "image_url",
    "is_subject_to_whitelist",
    "large_image_url",
    "medium_username",
    "name",
    "only_proxied_transfers",
    "opensea_buyer_fee_basis_points",
    "opensea_seller_fee_basis_points",
    "payout_address",
    "require_email",
    "short_description",
    "slug",
    "telegram_url",
    "twitter_username",
    "instagram_username",
    "wiki_url",
    "is_nsfw"
})
@Generated("jsonschema2pojo")
public class Collection {

    @JsonProperty("editors")
    private List<String> editors = null;
    @JsonProperty("payment_tokens")
    private List<PaymentToken> paymentTokens = null;
    @JsonProperty("primary_asset_contracts")
    private List<PrimaryAssetContract> primaryAssetContracts = null;
    @JsonProperty("traits")
    private Traits traits;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("banner_image_url")
    private String bannerImageUrl;
    @JsonProperty("chat_url")
    private Object chatUrl;
    @JsonProperty("created_date")
    private String createdDate;
    @JsonProperty("default_to_fiat")
    private Boolean defaultToFiat;
    @JsonProperty("description")
    private String description;
    @JsonProperty("dev_buyer_fee_basis_points")
    private String devBuyerFeeBasisPoints;
    @JsonProperty("dev_seller_fee_basis_points")
    private String devSellerFeeBasisPoints;
    @JsonProperty("discord_url")
    private String discordUrl;
    @JsonProperty("display_data")
    private DisplayData displayData;
    @JsonProperty("external_url")
    private String externalUrl;
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("featured_image_url")
    private String featuredImageUrl;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("safelist_request_status")
    private String safelistRequestStatus;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("is_subject_to_whitelist")
    private Boolean isSubjectToWhitelist;
    @JsonProperty("large_image_url")
    private String largeImageUrl;
    @JsonProperty("medium_username")
    private Object mediumUsername;
    @JsonProperty("name")
    private String name;
    @JsonProperty("only_proxied_transfers")
    private Boolean onlyProxiedTransfers;
    @JsonProperty("opensea_buyer_fee_basis_points")
    private String openseaBuyerFeeBasisPoints;
    @JsonProperty("opensea_seller_fee_basis_points")
    private String openseaSellerFeeBasisPoints;
    @JsonProperty("payout_address")
    private String payoutAddress;
    @JsonProperty("require_email")
    private Boolean requireEmail;
    @JsonProperty("short_description")
    private Object shortDescription;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("telegram_url")
    private Object telegramUrl;
    @JsonProperty("twitter_username")
    private String twitterUsername;
    @JsonProperty("instagram_username")
    private Object instagramUsername;
    @JsonProperty("wiki_url")
    private Object wikiUrl;
    @JsonProperty("is_nsfw")
    private Boolean isNsfw;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("editors")
    public List<String> getEditors() {
        return editors;
    }

    @JsonProperty("editors")
    public void setEditors(List<String> editors) {
        this.editors = editors;
    }

    @JsonProperty("payment_tokens")
    public List<PaymentToken> getPaymentTokens() {
        return paymentTokens;
    }

    @JsonProperty("payment_tokens")
    public void setPaymentTokens(List<PaymentToken> paymentTokens) {
        this.paymentTokens = paymentTokens;
    }

    @JsonProperty("primary_asset_contracts")
    public List<PrimaryAssetContract> getPrimaryAssetContracts() {
        return primaryAssetContracts;
    }

    @JsonProperty("primary_asset_contracts")
    public void setPrimaryAssetContracts(List<PrimaryAssetContract> primaryAssetContracts) {
        this.primaryAssetContracts = primaryAssetContracts;
    }

    @JsonProperty("traits")
    public Traits getTraits() {
        return traits;
    }

    @JsonProperty("traits")
    public void setTraits(Traits traits) {
        this.traits = traits;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @JsonProperty("banner_image_url")
    public String getBannerImageUrl() {
        return bannerImageUrl;
    }

    @JsonProperty("banner_image_url")
    public void setBannerImageUrl(String bannerImageUrl) {
        this.bannerImageUrl = bannerImageUrl;
    }

    @JsonProperty("chat_url")
    public Object getChatUrl() {
        return chatUrl;
    }

    @JsonProperty("chat_url")
    public void setChatUrl(Object chatUrl) {
        this.chatUrl = chatUrl;
    }

    @JsonProperty("created_date")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created_date")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("default_to_fiat")
    public Boolean getDefaultToFiat() {
        return defaultToFiat;
    }

    @JsonProperty("default_to_fiat")
    public void setDefaultToFiat(Boolean defaultToFiat) {
        this.defaultToFiat = defaultToFiat;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("dev_buyer_fee_basis_points")
    public String getDevBuyerFeeBasisPoints() {
        return devBuyerFeeBasisPoints;
    }

    @JsonProperty("dev_buyer_fee_basis_points")
    public void setDevBuyerFeeBasisPoints(String devBuyerFeeBasisPoints) {
        this.devBuyerFeeBasisPoints = devBuyerFeeBasisPoints;
    }

    @JsonProperty("dev_seller_fee_basis_points")
    public String getDevSellerFeeBasisPoints() {
        return devSellerFeeBasisPoints;
    }

    @JsonProperty("dev_seller_fee_basis_points")
    public void setDevSellerFeeBasisPoints(String devSellerFeeBasisPoints) {
        this.devSellerFeeBasisPoints = devSellerFeeBasisPoints;
    }

    @JsonProperty("discord_url")
    public String getDiscordUrl() {
        return discordUrl;
    }

    @JsonProperty("discord_url")
    public void setDiscordUrl(String discordUrl) {
        this.discordUrl = discordUrl;
    }

    @JsonProperty("display_data")
    public DisplayData getDisplayData() {
        return displayData;
    }

    @JsonProperty("display_data")
    public void setDisplayData(DisplayData displayData) {
        this.displayData = displayData;
    }

    @JsonProperty("external_url")
    public String getExternalUrl() {
        return externalUrl;
    }

    @JsonProperty("external_url")
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    @JsonProperty("featured")
    public Boolean getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    @JsonProperty("featured_image_url")
    public String getFeaturedImageUrl() {
        return featuredImageUrl;
    }

    @JsonProperty("featured_image_url")
    public void setFeaturedImageUrl(String featuredImageUrl) {
        this.featuredImageUrl = featuredImageUrl;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("safelist_request_status")
    public String getSafelistRequestStatus() {
        return safelistRequestStatus;
    }

    @JsonProperty("safelist_request_status")
    public void setSafelistRequestStatus(String safelistRequestStatus) {
        this.safelistRequestStatus = safelistRequestStatus;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("is_subject_to_whitelist")
    public Boolean getIsSubjectToWhitelist() {
        return isSubjectToWhitelist;
    }

    @JsonProperty("is_subject_to_whitelist")
    public void setIsSubjectToWhitelist(Boolean isSubjectToWhitelist) {
        this.isSubjectToWhitelist = isSubjectToWhitelist;
    }

    @JsonProperty("large_image_url")
    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    @JsonProperty("large_image_url")
    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    @JsonProperty("medium_username")
    public Object getMediumUsername() {
        return mediumUsername;
    }

    @JsonProperty("medium_username")
    public void setMediumUsername(Object mediumUsername) {
        this.mediumUsername = mediumUsername;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
    public String getOpenseaBuyerFeeBasisPoints() {
        return openseaBuyerFeeBasisPoints;
    }

    @JsonProperty("opensea_buyer_fee_basis_points")
    public void setOpenseaBuyerFeeBasisPoints(String openseaBuyerFeeBasisPoints) {
        this.openseaBuyerFeeBasisPoints = openseaBuyerFeeBasisPoints;
    }

    @JsonProperty("opensea_seller_fee_basis_points")
    public String getOpenseaSellerFeeBasisPoints() {
        return openseaSellerFeeBasisPoints;
    }

    @JsonProperty("opensea_seller_fee_basis_points")
    public void setOpenseaSellerFeeBasisPoints(String openseaSellerFeeBasisPoints) {
        this.openseaSellerFeeBasisPoints = openseaSellerFeeBasisPoints;
    }

    @JsonProperty("payout_address")
    public String getPayoutAddress() {
        return payoutAddress;
    }

    @JsonProperty("payout_address")
    public void setPayoutAddress(String payoutAddress) {
        this.payoutAddress = payoutAddress;
    }

    @JsonProperty("require_email")
    public Boolean getRequireEmail() {
        return requireEmail;
    }

    @JsonProperty("require_email")
    public void setRequireEmail(Boolean requireEmail) {
        this.requireEmail = requireEmail;
    }

    @JsonProperty("short_description")
    public Object getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("short_description")
    public void setShortDescription(Object shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("telegram_url")
    public Object getTelegramUrl() {
        return telegramUrl;
    }

    @JsonProperty("telegram_url")
    public void setTelegramUrl(Object telegramUrl) {
        this.telegramUrl = telegramUrl;
    }

    @JsonProperty("twitter_username")
    public String getTwitterUsername() {
        return twitterUsername;
    }

    @JsonProperty("twitter_username")
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    @JsonProperty("instagram_username")
    public Object getInstagramUsername() {
        return instagramUsername;
    }

    @JsonProperty("instagram_username")
    public void setInstagramUsername(Object instagramUsername) {
        this.instagramUsername = instagramUsername;
    }

    @JsonProperty("wiki_url")
    public Object getWikiUrl() {
        return wikiUrl;
    }

    @JsonProperty("wiki_url")
    public void setWikiUrl(Object wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    @JsonProperty("is_nsfw")
    public Boolean getIsNsfw() {
        return isNsfw;
    }

    @JsonProperty("is_nsfw")
    public void setIsNsfw(Boolean isNsfw) {
        this.isNsfw = isNsfw;
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
