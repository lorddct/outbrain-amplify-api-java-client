package com.xy1m.amplify.model.performance_reporting.content_periodic_campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "campaignId",
        "results",
        "totalResults"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignResult {

    @JsonProperty("campaignId")
    private String campaignId;

    @JsonProperty("results")
    private List<Result> results;

    @JsonProperty("totalResults")
    private int totalResults;

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
