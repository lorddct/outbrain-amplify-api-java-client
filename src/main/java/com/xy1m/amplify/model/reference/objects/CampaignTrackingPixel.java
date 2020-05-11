/*
 * Copyright 2020 InPowered. All Rights Reserved.
 *
 * This software is the proprietary information of InPowered.
 * Use is subject to license terms.
 */

package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "enabled",
        "urls"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignTrackingPixel {

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("urls")
    private List<String> urls;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

}
