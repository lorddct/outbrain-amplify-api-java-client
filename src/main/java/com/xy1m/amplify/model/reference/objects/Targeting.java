package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.Platform;
import com.xy1m.amplify.model.reference.types.PlatformBrowser;
import com.xy1m.amplify.model.reference.types.PlatformOperatingSystem;
import com.xy1m.amplify.model.resource.GeoLocation;
import com.xy1m.amplify.model.resource.InterestTargeting;

import java.util.List;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Targeting {

    @JsonProperty("platform")
    private List<Platform> platform;

    @JsonProperty("locations")
    private List<GeoLocation> locations;

    @JsonProperty("browsers")
    private List<PlatformBrowser> browsers;

    @JsonProperty("operatingSystems")
    private List<PlatformOperatingSystem> operatingSystems;

    @JsonProperty("interests")
    private List<InterestTargeting> interests;

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

    public List<GeoLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<GeoLocation> locations) {
        this.locations = locations;
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

    public List<InterestTargeting> getInterests() {
        return interests;
    }

    public void setInterests(List<InterestTargeting> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Targeting{");
        sb.append("platform=").append(platform);
        sb.append(", locations=").append(locations);
        sb.append(", excludeAdBlockUsers=").append(excludeAdBlockUsers);
        sb.append(", customAudience=").append(customAudience);
        sb.append(", includeCellularNetwork=").append(includeCellularNetwork);
        sb.append(", browsers=").append(browsers);
        sb.append(", operatingSystems=").append(operatingSystems);
        sb.append(", interests=").append(interests);
        sb.append('}');
        return sb.toString();
    }
}
