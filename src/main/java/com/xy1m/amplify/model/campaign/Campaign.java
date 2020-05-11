package com.xy1m.amplify.model.campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.annotations.ReadOnly;
import com.xy1m.amplify.model.budget.Budget;
import com.xy1m.amplify.model.reference.objects.Bids;
import com.xy1m.amplify.model.reference.objects.CampaignBlockedSites;
import com.xy1m.amplify.model.reference.objects.CampaignOptimization;
import com.xy1m.amplify.model.reference.objects.CampaignScheduling;
import com.xy1m.amplify.model.reference.objects.CampaignTrackingPixel;
import com.xy1m.amplify.model.reference.objects.LiveStatus;
import com.xy1m.amplify.model.reference.objects.Targeting;
import com.xy1m.amplify.model.reference.types.CampaignObjective;
import com.xy1m.amplify.model.reference.types.CampaignOnAirType;
import com.xy1m.amplify.model.reference.types.ContentType;
import com.xy1m.amplify.model.reference.types.PrefixTrackingCode;
import com.xy1m.amplify.model.reference.types.SuffixTrackingCode;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "marketerId",
        "enabled",
        "cpc",
        "minimumCpc",
        "currency",
        "autoArchived",
        "targeting",
        "feeds",
        "autoExpirationOfPromotedLinks",
        "contentType",
        "budget",
        "budgetId",
        "suffixTrackingCode",
        "lastModified",
        "creationTime",
        "liveStatus",
        "cpcPerAdEnabled",
        "campaignBlockedSites",
        "startHour",
        "trackingPixels",
        "bids",
        "campaignOptimization",
        "onAirType",
        "scheduling",
        "objective",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("marketerId")
    private String marketerId;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("cpc")
    private BigDecimal cpc;
    @JsonProperty("minimumCpc")
    @ReadOnly
    private BigDecimal minimumCpc;
    @JsonProperty("currency")
    @ReadOnly
    private String currency;
    @JsonProperty("autoArchived")
    private Boolean autoArchived;
    @JsonProperty("targeting")
    private Targeting targeting;
    @JsonProperty("feeds")
    private List<String> feeds;
    @JsonProperty("autoExpirationOfPromotedLinks")
    private Integer autoExpirationOfPromotedLinks;
    @JsonProperty("contentType")
    private ContentType contentType;
    @JsonProperty("budget")
    @ReadOnly
    private Budget budget;
    @JsonProperty("budgetId")
    private String budgetId;
    @JsonProperty("suffixTrackingCode")
    private SuffixTrackingCode suffixTrackingCode;
    @JsonProperty("prefixTrackingCode")
    private PrefixTrackingCode prefixTrackingCode;
    @JsonProperty("lastModified")
    private String lastModified;
    @JsonProperty("creationTime")
    private String creationTime;
    @JsonProperty("liveStatus")
    private LiveStatus liveStatus;
    @JsonProperty("cpcPerAdEnabled")
    private Boolean cpcPerAdEnabled;
    @JsonProperty("campaignBlockedSites")
    private CampaignBlockedSites campaignBlockedSites;
    @JsonProperty("startHour")
    private String startHour;
    @JsonProperty("trackingPixels")
    private CampaignTrackingPixel trackingPixels;
    @JsonProperty("bids")
    private Bids bids;
    @JsonProperty("campaignOptimization")
    private CampaignOptimization campaignOptimization;
    @JsonProperty("onAirType")
    private CampaignOnAirType onAirType;
    @JsonProperty("scheduling")
    private CampaignScheduling scheduling;
    @JsonProperty("objective")
    private CampaignObjective objective;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarketerId() {
        return marketerId;
    }

    public void setMarketerId(String marketerId) {
        this.marketerId = marketerId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BigDecimal getCpc() {
        return cpc;
    }

    public void setCpc(BigDecimal cpc) {
        this.cpc = cpc;
    }

    public BigDecimal getMinimumCpc() {
        return minimumCpc;
    }

    public void setMinimumCpc(BigDecimal minimumCpc) {
        this.minimumCpc = minimumCpc;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getAutoArchived() {
        return autoArchived;
    }

    public void setAutoArchived(Boolean autoArchived) {
        this.autoArchived = autoArchived;
    }

    public Targeting getTargeting() {
        return targeting;
    }

    public void setTargeting(Targeting targeting) {
        this.targeting = targeting;
    }

    public List<String> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<String> feeds) {
        this.feeds = feeds;
    }

    public Integer getAutoExpirationOfPromotedLinks() {
        return autoExpirationOfPromotedLinks;
    }

    public void setAutoExpirationOfPromotedLinks(Integer autoExpirationOfPromotedLinks) {
        this.autoExpirationOfPromotedLinks = autoExpirationOfPromotedLinks;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public SuffixTrackingCode getSuffixTrackingCode() {
        return suffixTrackingCode;
    }

    public void setSuffixTrackingCode(SuffixTrackingCode suffixTrackingCode) {
        this.suffixTrackingCode = suffixTrackingCode;
    }

    public PrefixTrackingCode getPrefixTrackingCode() {
        return prefixTrackingCode;
    }

    public void setPrefixTrackingCode(PrefixTrackingCode prefixTrackingCode) {
        this.prefixTrackingCode = prefixTrackingCode;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public LiveStatus getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(LiveStatus liveStatus) {
        this.liveStatus = liveStatus;
    }

    public Boolean getCpcPerAdEnabled() {
        return cpcPerAdEnabled;
    }

    public void setCpcPerAdEnabled(Boolean cpcPerAdEnabled) {
        this.cpcPerAdEnabled = cpcPerAdEnabled;
    }

    public CampaignBlockedSites getCampaignBlockedSites() {
        return campaignBlockedSites;
    }

    public void setCampaignBlockedSites(CampaignBlockedSites campaignBlockedSites) {
        this.campaignBlockedSites = campaignBlockedSites;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public Bids getBids() {
        return bids;
    }

    public void setBids(Bids bids) {
        this.bids = bids;
    }

    public CampaignOptimization getCampaignOptimization() {
        return campaignOptimization;
    }

    public void setCampaignOptimization(CampaignOptimization campaignOptimization) {
        this.campaignOptimization = campaignOptimization;
    }

    public CampaignOnAirType getOnAirType() {
        return onAirType;
    }

    public void setOnAirType(CampaignOnAirType onAirType) {
        this.onAirType = onAirType;
    }

    public CampaignScheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(CampaignScheduling scheduling) {
        this.scheduling = scheduling;
    }

    public CampaignObjective getObjective() {
        return objective;
    }

    public void setObjective(CampaignObjective objective) {
        this.objective = objective;
    }

    public CampaignTrackingPixel getTrackingPixels() {
        return trackingPixels;
    }

    public void setTrackingPixels(CampaignTrackingPixel trackingPixels) {
        this.trackingPixels = trackingPixels;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Campaign{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", marketerId='").append(marketerId).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append(", cpc=").append(cpc);
        sb.append(", minimumCpc=").append(minimumCpc);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", autoArchived=").append(autoArchived);
        sb.append(", targeting=").append(targeting);
        sb.append(", feeds=").append(feeds);
        sb.append(", autoExpirationOfPromotedLinks=").append(autoExpirationOfPromotedLinks);
        sb.append(", contentType=").append(contentType);
        sb.append(", budget=").append(budget);
        sb.append(", budgetId='").append(budgetId).append('\'');
        sb.append(", suffixTrackingCode=").append(suffixTrackingCode);
        sb.append(", preixTrackingCode=").append(prefixTrackingCode);
        sb.append(", lastModified=").append(lastModified);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", liveStatus=").append(liveStatus);
        sb.append(", cpcPerAdEnabled=").append(cpcPerAdEnabled);
        sb.append(", campaignBlockedSites=").append(campaignBlockedSites);
        sb.append(", startHour='").append(startHour).append('\'');
        sb.append(", trackingPixels=").append(trackingPixels);
        sb.append(", bids=").append(bids);
        sb.append(", campaignOptimization=").append(campaignOptimization);
        sb.append(", onAirType=").append(onAirType);
        sb.append(", scheduling=").append(scheduling);
        sb.append(", objective=").append(objective);
        sb.append('}');
        return sb.toString();
    }
}
