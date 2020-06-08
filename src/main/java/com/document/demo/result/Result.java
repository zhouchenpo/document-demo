package com.document.demo.result;


import lombok.Data;

import java.util.HashMap;
@Data
public class Result {
    int code;
    String message;
    boolean success;
    HashMap<String, Object> data;

    public Result(int code, String message, boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public Result(HashMap<String, Object> data, int code, String message, boolean success) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public Result(int statusCode, String description) {
        this.code = statusCode;
        this.message = description;
    }

}
