package com.xy1m.amplify.model.performance.reporting.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

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
        "viewAverageValue"
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
    private int conversionRate;

    @JsonProperty("viewConversionRate")
    private int viewConversionRate;

    @JsonProperty("cpa")
    private int cpa;

    @JsonProperty("totalCpa")
    private int totalCpa;

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

    public int getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(int conversionRate) {
        this.conversionRate = conversionRate;
    }

    public int getViewConversionRate() {
        return viewConversionRate;
    }

    public void setViewConversionRate(int viewConversionRate) {
        this.viewConversionRate = viewConversionRate;
    }

    public int getCpa() {
        return cpa;
    }

    public void setCpa(int cpa) {
        this.cpa = cpa;
    }

    public int getTotalCpa() {
        return totalCpa;
    }

    public void setTotalCpa(int totalCpa) {
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
