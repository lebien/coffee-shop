package com.coffeeshop.orderservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResult<T> implements Serializable {


    private boolean success;

    private String code;

    private String message;

    private T data;

    protected CommonResult(boolean success, String code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static CommonResult<String> created(String id) {
        return new CommonResult<>(true, ResultCode.CREATED.getCode(), ResultCode.CREATED.getMessage(), id);
    }

    public static CommonResult<String> created(String id, String message) {
        return new CommonResult<>(true, ResultCode.CREATED.getCode(), message, id);
    }

    public static CommonResult<String> updated(String id) {
        return new CommonResult<>(true, ResultCode.UPDATED.getCode(), ResultCode.UPDATED.getMessage(), id);
    }

    public static CommonResult<String> updated(String id, String message) {
        return new CommonResult<>(true, ResultCode.UPDATED.getCode(), message, id);
    }

    public static CommonResult<String> deleted() {
        return new CommonResult<>(true, ResultCode.DELETED.getCode(), ResultCode.DELETED.getMessage(), null);
    }

    public static CommonResult<String> deleted(String message) {
        return new CommonResult<>(true, ResultCode.DELETED.getCode(), message, null);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(true, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<>(true, ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> CommonResult<T> failed(ErrorCode errorCode) {
        return new CommonResult<>(false, errorCode.getCode(), errorCode.getMessage(), null);
    }

    public static <T> CommonResult<T> failed(ErrorCode errorCode, String message) {
        return new CommonResult<>(false, errorCode.getCode(), message, null);
    }
}
