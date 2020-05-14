package com.xy1m.amplify.model.performance.reporting.publishers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.BlockStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "url",
        "blockStatus",
        "blockTypes",
        "isOen"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("blockStatus")
    private BlockStatus blockStatus;

    @JsonProperty("blockTypes")
    private BlockTypes blockTypes;

    @JsonProperty("url")
    private String url;

    @JsonProperty("isOen")
    private boolean isOen;

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

    public BlockStatus getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(BlockStatus blockStatus) {
        this.blockStatus = blockStatus;
    }

    public BlockTypes getBlockTypes() {
        return blockTypes;
    }

    public void setBlockTypes(BlockTypes blockTypes) {
        this.blockTypes = blockTypes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isOen() {
        return this.isOen;
    }

    public void setOen(boolean oen) {
        this.isOen = oen;
    }
}
