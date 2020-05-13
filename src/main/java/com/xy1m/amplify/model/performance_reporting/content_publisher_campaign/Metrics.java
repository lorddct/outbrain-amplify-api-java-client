package com.xy1m.amplify.model.performance_reporting.content_publisher_campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "impressions",
        "clicks",
        "totalConversions",
        "conversions",
        "viewConversions",
        "spend",
        "ecpc",
        "ctr",
        "conversionRate",
        "viewConversionRate",
        "cpa",
        "totalCpa",
        "totalValue",
        "totalSumValue",
        "sumValue",
        "viewSumValue",
        "totalAverageValue",
        "averageValue",
        "viewAverageValue",
        "conversionMetrics"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metrics {

    @JsonProperty("impressions")
    private int impressions;

    @JsonProperty("clicks")
    private int clicks;

    @JsonProperty("totalConversions")
    private int totalConversions;

    @JsonProperty("conversions")
    private int conversions;

    @JsonProperty("viewConversions")
    private int viewConversions;

    @JsonProperty("spend")
    private BigDecimal spend;

    @JsonProperty("ecpc")
    private BigDecimal ecpc;

    @JsonProperty("ctr")
    private BigDecimal ctr;

    @JsonProperty("conversionRate")
    private BigDecimal conversionRate;

    @JsonProperty("viewConversionRate")
    private int viewConversionRate;

    @JsonProperty("cpa")
    private BigDecimal cpa;

    @JsonProperty("totalCpa")
    private BigDecimal totalCpa;

    @JsonProperty("totalValue")
    private int totalValue;

    @JsonProperty("totalSumValue")
    private int totalSumValue;

    @JsonProperty("sumValue")
    private int sumValue;

    @JsonProperty("viewSumValue")
    private int viewSumValue;

    @JsonProperty("totalAverageValue")
    private BigDecimal totalAverageValue;

    @JsonProperty("averageValue")
    private BigDecimal averageValue;

    @JsonProperty("viewAverageValue")
    private int viewAverageValue;

    @JsonProperty("conversionMetrics")
    private List<ConversionMetric> conversionMetrics;

    public int getImpressions() {
        return impressions;
    }

    public void setImpressions(int impressions) {
        this.impressions = impressions;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
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

    public BigDecimal getSpend() {
        return spend;
    }

    public void setSpend(BigDecimal spend) {
        this.spend = spend;
    }

    public BigDecimal getEcpc() {
        return ecpc;
    }

    public void setEcpc(BigDecimal ecpc) {
        this.ecpc = ecpc;
    }

    public BigDecimal getCtr() {
        return ctr;
    }

    public void setCtr(BigDecimal ctr) {
        this.ctr = ctr;
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

    public BigDecimal getCpa() {
        return cpa;
    }

    public void setCpa(BigDecimal cpa) {
        this.cpa = cpa;
    }

    public BigDecimal getTotalCpa() {
        return totalCpa;
    }

    public void setTotalCpa(BigDecimal totalCpa) {
        this.totalCpa = totalCpa;
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

    public BigDecimal getTotalAverageValue() {
        return totalAverageValue;
    }

    public void setTotalAverageValue(BigDecimal totalAverageValue) {
        this.totalAverageValue = totalAverageValue;
    }

    public BigDecimal getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(BigDecimal averageValue) {
        this.averageValue = averageValue;
    }

    public int getViewAverageValue() {
        return viewAverageValue;
    }

    public void setViewAverageValue(int viewAverageValue) {
        this.viewAverageValue = viewAverageValue;
    }

    public List<ConversionMetric> getConversionMetrics() {
        return conversionMetrics;
    }

    public void setConversionMetrics(List<ConversionMetric> conversionMetrics) {
        this.conversionMetrics = conversionMetrics;
    }
}
