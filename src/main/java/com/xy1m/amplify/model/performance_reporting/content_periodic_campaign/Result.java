package com.xy1m.amplify.model.performance_reporting.content_periodic_campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "metadata",
        "metrics"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("metrics")
    private Metrics metrics;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }
}
