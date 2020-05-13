package com.xy1m.amplify.model.performance.reporting.periodic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "fromDate",
        "toDate"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {

    @JsonProperty("id")
    private Date id;

    @JsonProperty("fromDate")
    private Date fromDate;

    @JsonProperty("toDate")
    private Date toDate;

    public Date getId() {
        return id;
    }

    public void setId(Date id) {
        this.id = id;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
