package com.xy1m.amplify.model.marketer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "marketers",
        "count"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketerListResponse {

    @JsonProperty("marketers")
    private List<Marketer> marketers;

    @JsonProperty("count")
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Marketer> getMarketers() {
        return marketers;
    }

    public void setMarketers(List<Marketer> marketers) {
        this.marketers = marketers;
    }
}