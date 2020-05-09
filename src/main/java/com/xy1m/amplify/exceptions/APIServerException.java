package com.xy1m.amplify.exceptions;

public class APIServerException extends APIException {

    public APIServerException(Throwable cause) {
        super("Failed to perform API call, unknown reason.", cause);
    }

    public APIServerException(int responseCode) {
        super("Failed to perform API call with status code [%d].", responseCode);
    }
}
