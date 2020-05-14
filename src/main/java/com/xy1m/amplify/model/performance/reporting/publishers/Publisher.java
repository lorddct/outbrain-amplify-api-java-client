package com.xy1m.amplify.model.performance.reporting.publishers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "results",
        "totalResults",
        "summary",
        "totalFilteredResults",
        "summaryFiltered"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Publisher {

    @JsonProperty("results")
    private List<Result> results;

    @JsonProperty("totalResults")
    private int totalResults;

    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("totalFilteredResults")
    private int totalFilteredResults;

    @JsonProperty("summaryFiltered")
    private SummaryFiltered summaryFiltered;

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

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public int getTotalFilteredResults() {
        return totalFilteredResults;
    }

    public void setTotalFilteredResults(int totalFilteredResults) {
        this.totalFilteredResults = totalFilteredResults;
    }

    public SummaryFiltered getSummaryFiltered() {
        return summaryFiltered;
    }

    public void setSummaryFiltered(SummaryFiltered summaryFiltered) {
        this.summaryFiltered = summaryFiltered;
    }
}
