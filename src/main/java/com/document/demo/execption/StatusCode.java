package com.document.demo.execption;

import org.apache.commons.lang3.StringUtils;

public enum StatusCode {
    SUCCESS("成功"),
    ACCESS_TOKEN_WRONG("错误的accessToken值"),
    SESSION_EXPIRY("session已过期，请重新刷新登录！"),
    SYSTEM_ERROR("系统错误"),
    REQUEST_METHOD_NOT_SUPPORTED("请求方法不支持"),
    INVOKING_ERROR("调用异常"),
    FIELD_ERROR("参数错误"),
    MISSING_FIELD("参数缺失"),
    RESUBMIT("重复提交"),
    BIZ_MISTAKE("业务错误"),
    ASSERT_ERROR("业务断言错误"),
    PERMISSION_DENY("没有权限");

    private final String value;

    StatusCode(String value) {
        this.value = value;
    }

    public static StatusCode nameOf(String statusCode) {
        for (StatusCode status : values()) {
            if (StringUtils.equals(status.name(), statusCode)) {
                return status;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\", \"value\"=\"");
        sb.append(value);
        sb.append("\"}");
        return sb.toString();
    }
}
