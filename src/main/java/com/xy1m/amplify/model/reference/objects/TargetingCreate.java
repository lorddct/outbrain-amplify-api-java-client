package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.Platform;
import com.xy1m.amplify.model.reference.types.PlatformBrowser;
import com.xy1m.amplify.model.reference.types.PlatformOperatingSystem;
import com.xy1m.amplify.model.resource.InterestTargetingCreate;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "platform",
        "locations",
        "excludeAdBlockUsers",
        "customAudience",
        "useExtendedNetworkTraffic",
        "browsers",
        "operatingSystems",
        "interests"
})
public class TargetingCreate {

    @JsonProperty("platform")
    private List<Platform> platform;

    @JsonProperty("locations")
    private List<String> locations;

    @JsonProperty("browsers")
    private List<PlatformBrowser> browsers;

    @JsonProperty("operatingSystems")
    private List<PlatformOperatingSystem> operatingSystems;

    @JsonProperty("interests")
    private Map<String, Object> interestsMap;

    @JsonProperty("excludeAdBlockUsers")
    private Boolean excludeAdBlockUsers;

    @JsonProperty("customAudience")
    private CustomAudience customAudience;

    @JsonProperty("includeCellularNetwork")
    private Boolean includeCellularNetwork;

    public List<Platform> getPlatform() {
        return platform;
    }

    public void setPlatform(List<Platform> platform) {
        this.platform = platform;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<PlatformBrowser> getBrowsers() {
        return browsers;
    }

    public void setBrowsers(List<PlatformBrowser> browsers) {
        this.browsers = browsers;
    }

    public List<PlatformOperatingSystem> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<PlatformOperatingSystem> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public Map<String, Object> getInterestsMap() {
        return interestsMap;
    }

    public void setInterestsMap(Map<String, Object> interestsMap) {
        this.interestsMap = interestsMap;
    }

    @JsonIgnore
    public void setInterestDefinition(InterestTargetingCreate interestDefinition) {
        setInterestsMap(interestDefinition.toMap());
    }

    public Boolean getExcludeAdBlockUsers() {
        return excludeAdBlockUsers;
    }

    public void setExcludeAdBlockUsers(Boolean excludeAdBlockUsers) {
        this.excludeAdBlockUsers = excludeAdBlockUsers;
    }

    public CustomAudience getCustomAudience() {
        return customAudience;
    }

    public void setCustomAudience(CustomAudience customAudience) {
        this.customAudience = customAudience;
    }

    public Boolean getIncludeCellularNetwork() {
        return includeCellularNetwork;
    }

    public void setIncludeCellularNetwork(Boolean includeCellularNetwork) {
        this.includeCellularNetwork = includeCellularNetwork;
    }
}
