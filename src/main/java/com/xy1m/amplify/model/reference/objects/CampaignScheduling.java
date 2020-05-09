package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cpc",
        "onAir"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignScheduling {

    @JsonProperty("cpc")
    private List<CampaignCpcSchedulingRules> cpc;

    @JsonProperty("onAir")
    private List<CampaignOnAirSchedulingRules> onAir;

    public List<CampaignCpcSchedulingRules> getCpc() {
        return cpc;
    }

    public void setCpc(List<CampaignCpcSchedulingRules> cpc) {
        this.cpc = cpc;
    }

    public List<CampaignOnAirSchedulingRules> getOnAir() {
        return onAir;
    }

    public void setOnAir(List<CampaignOnAirSchedulingRules> onAir) {
        this.onAir = onAir;
    }

}
