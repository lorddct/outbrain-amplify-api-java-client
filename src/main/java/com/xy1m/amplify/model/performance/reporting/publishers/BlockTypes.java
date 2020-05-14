package com.xy1m.amplify.model.performance.reporting.publishers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "marketerPublisher",
        "marketerSection",
        "campaignPublisher",
        "campaignSection",
        "oenOptOut"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockTypes {

    @JsonProperty("marketerPublisher")
    private boolean marketerPublisher;

    @JsonProperty("marketerSection")
    private boolean marketerSection;

    @JsonProperty("campaignPublisher")
    private boolean campaignPublisher;

    @JsonProperty("campaignSection")
    private boolean campaignSection;

    @JsonProperty("oenOptOut")
    private boolean oenOptOut;

    public boolean isMarketerPublisher() {
        return marketerPublisher;
    }

    public void setMarketerPublisher(boolean marketerPublisher) {
        this.marketerPublisher = marketerPublisher;
    }

    public boolean isMarketerSection() {
        return marketerSection;
    }

    public void setMarketerSection(boolean marketerSection) {
        this.marketerSection = marketerSection;
    }

    public boolean isCampaignPublisher() {
        return campaignPublisher;
    }

    public void setCampaignPublisher(boolean campaignPublisher) {
        this.campaignPublisher = campaignPublisher;
    }

    public boolean isCampaignSection() {
        return campaignSection;
    }

    public void setCampaignSection(boolean campaignSection) {
        this.campaignSection = campaignSection;
    }

    public boolean isOenOptOut() {
        return oenOptOut;
    }

    public void setOenOptOut(boolean oenOptOut) {
        this.oenOptOut = oenOptOut;
    }
}
