package com.xy1m.amplify.model.performance.reporting.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "promotedLinkId",
        "results",
        "totalResults"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotedLinkResult {

    @JsonProperty("promotedLinkId")
    private String promotedLinkId;

    @JsonProperty("results")
    private List<Result> results;

    @JsonProperty("totalResults")
    private int totalResults;

    public String getPromotedLinkId() {
        return promotedLinkId;
    }

    public void setPromotedLinkId(String promotedLinkId) {
        this.promotedLinkId = promotedLinkId;
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
