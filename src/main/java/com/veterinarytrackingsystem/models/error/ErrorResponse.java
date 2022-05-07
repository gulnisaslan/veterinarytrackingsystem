package com.veterinarytrackingsystem.models.error;

public class ErrorResponse {
    private final String source;

    public String getSource() {
        return source;
    }

    public String getMessage() {
        return message;
    }

    private final String message;

    public ErrorResponse(String source, String message) {
        this.source = source;
        this.message = message;
    }
}
