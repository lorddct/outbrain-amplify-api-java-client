package com.xy1m.amplify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "message",
        "validationErrors"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIError {

    public static final APIError EMPTY = new APIError();

    @JsonProperty("message")
    private String message;

    @JsonProperty("validationErrors")
    private List<String> validationErrors;

    public APIError() {
    }

    public APIError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<String> validationErrors) {
        this.validationErrors = validationErrors;
    }

    @Override
    public String toString() {
        return "APIError{" +
                "message='" + message + '\'' +
                ", validationErrors=" + validationErrors +
                '}';
    }
}
