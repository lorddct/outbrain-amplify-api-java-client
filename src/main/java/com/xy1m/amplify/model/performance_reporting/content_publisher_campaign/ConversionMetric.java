package com.xy1m.amplify.model.performance_reporting.content_publisher_campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "totalConversions",
        "conversions",
        "viewConversions",
        "conversionRate",
        "viewConversionRate",
        "totalCpa",
        "cpa",
        "totalValue",
        "totalSumValue",
        "sumValue",
        "viewSumValue",
        "totalAverageValue",
        "averageValue",
        "viewAverageValue"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversionMetric {

    @JsonProperty("name")
    private String name;

    @JsonProperty("totalConversions")
    private int totalConversions;

    @JsonProperty("conversions")
    private int conversions;

    @JsonProperty("viewConversions")
    private int viewConversions;

    @JsonProperty("conversionRate")
    private BigDecimal conversionRate;

    @JsonProperty("viewConversionRate")
    private int viewConversionRate;

    @JsonProperty("totalCpa")
    private BigDecimal totalCpa;

    @JsonProperty("cpa")
    private BigDecimal cpa;

    @JsonProperty("totalValue")
    private int totalValue;

    @JsonProperty("totalSumValue")
    private int totalSumValue;

    @JsonProperty("sumValue")
    private int sumValue;

    @JsonProperty("viewSumValue")
    private int viewSumValue;

    @JsonProperty("totalAverageValue")
    private int totalAverageValue;

    @JsonProperty("averageValue")
    private int averageValue;

    @JsonProperty("viewAverageValue")
    private int viewAverageValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalConversions() {
        return totalConversions;
    }

    public void setTotalConversions(int totalConversions) {
        this.totalConversions = totalConversions;
    }

    public int getConversions() {
        return conversions;
    }

    public void setConversions(int conversions) {
        this.conversions = conversions;
    }

    public int getViewConversions() {
        return viewConversions;
    }

    public void setViewConversions(int viewConversions) {
        this.viewConversions = viewConversions;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public int getViewConversionRate() {
        return viewConversionRate;
    }

    public void setViewConversionRate(int viewConversionRate) {
        this.viewConversionRate = viewConversionRate;
    }

    public BigDecimal getTotalCpa() {
        return totalCpa;
    }

    public void setTotalCpa(BigDecimal totalCpa) {
        this.totalCpa = totalCpa;
    }

    public BigDecimal getCpa() {
        return cpa;
    }

    public void setCpa(BigDecimal cpa) {
        this.cpa = cpa;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public int getTotalSumValue() {
        return totalSumValue;
    }

    public void setTotalSumValue(int totalSumValue) {
        this.totalSumValue = totalSumValue;
    }

    public int getSumValue() {
        return sumValue;
    }

    public void setSumValue(int sumValue) {
        this.sumValue = sumValue;
    }

    public int getViewSumValue() {
        return viewSumValue;
    }

    public void setViewSumValue(int viewSumValue) {
        this.viewSumValue = viewSumValue;
    }

    public int getTotalAverageValue() {
        return totalAverageValue;
    }

    public void setTotalAverageValue(int totalAverageValue) {
        this.totalAverageValue = totalAverageValue;
    }

    public int getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(int averageValue) {
        this.averageValue = averageValue;
    }

    public int getViewAverageValue() {
        return viewAverageValue;
    }

    public void setViewAverageValue(int viewAverageValue) {
        this.viewAverageValue = viewAverageValue;
    }
}
