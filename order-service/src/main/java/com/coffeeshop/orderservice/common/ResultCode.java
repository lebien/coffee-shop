package com.coffeeshop.orderservice.common;

public enum ResultCode implements ErrorCode {
    SUCCESS("200", "Get data success"),
    CREATED("CREATED", "Created successfully"),
    UPDATED("UPDATED", "Updated successfully"),
    DELETED("DELETED", "Deleted"),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "Unexpected server error"),
    NOT_FOUND("RECORD_NOT_FOUND", "Record not found"),
    BAD_REQUEST("INVALID_REQUEST", "Invalid request");

    private final String code;
    private final String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
