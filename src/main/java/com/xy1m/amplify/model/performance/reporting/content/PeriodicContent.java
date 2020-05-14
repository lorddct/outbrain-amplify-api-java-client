package com.xy1m.amplify.model.performance.reporting.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "promotedLinkResults",
        "totalPromotedLinks"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeriodicContent {

    @JsonProperty("promotedLinkResults")
    private List<PromotedLinkResult> promotedLinkResults;

    @JsonProperty("totalPromotedLinks")
    private int totalPromotedLinks;

    public List<PromotedLinkResult> getPromotedLinkResults() {
        return promotedLinkResults;
    }

    public void setPromotedLinkResults(List<PromotedLinkResult> promotedLinkResults) {
        this.promotedLinkResults = promotedLinkResults;
    }

    public int getTotalPromotedLinks() {
        return totalPromotedLinks;
    }

    public void setTotalPromotedLinks(int totalPromotedLinks) {
        this.totalPromotedLinks = totalPromotedLinks;
    }
}
