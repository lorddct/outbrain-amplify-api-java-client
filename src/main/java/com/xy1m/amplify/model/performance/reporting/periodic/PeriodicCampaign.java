package com.xy1m.amplify.model.performance.reporting.periodic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "campaignResults",
        "totalCampaigns"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeriodicCampaign {

    @JsonProperty("campaignResults")
    private List<CampaignResult> campaignResults;

    @JsonProperty("totalCampaigns")
    private int totalCampaigns;

    public List<CampaignResult> getCampaignResults() {
        return campaignResults;
    }

    public void setCampaignResults(List<CampaignResult> campaignResults) {
        this.campaignResults = campaignResults;
    }

    public int getTotalCampaigns() {
        return totalCampaigns;
    }

    public void setTotalCampaigns(int totalCampaigns) {
        this.totalCampaigns = totalCampaigns;
    }
}
