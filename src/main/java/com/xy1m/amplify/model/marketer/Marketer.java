package com.xy1m.amplify.model.marketer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.objects.MarketerBlockedSites;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "enabled",
        "blockedSites",
        "creationTime",
        "lastModified"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Marketer {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("blockedSites")
    private MarketerBlockedSites blockedSites;

    @JsonProperty("creationTime")
    private String creationTime;

    @JsonProperty("lastModified")
    private String lastModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public MarketerBlockedSites getBlockedSites() {
        return blockedSites;
    }

    public void setBlockedSites(MarketerBlockedSites blockedSites) {
        this.blockedSites = blockedSites;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "Marketer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", enabled=" + enabled +
                ", blockedSites=" + blockedSites +
                ", creationTime='" + creationTime + '\'' +
                ", lastModified='" + lastModified + '\'' +
                '}';
    }

}
