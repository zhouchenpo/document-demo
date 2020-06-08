package com.document.demo.result;

import com.document.demo.execption.StatusCode;
import com.fasterxml.jackson.annotation.JsonView;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * Reason: TODO ADD REASON.
 *
 * @author Nexus
 * @version $Id: Result, v 0.1 16/8/8 上午11:21
 */

public class Results<T> implements Serializable {

    private static final long serialVersionUID = -3951187350403816092L;

    public static interface OnlyHintView {

    }

    public static interface OnlyObjectView {

    }

    public static interface AllView extends OnlyHintView, OnlyObjectView {

    }

    @JsonView({OnlyHintView.class, AllView.class})
    public boolean isSuccess() {
        return StringUtils.equals(getStatus(), StatusCode.SUCCESS.name());
    }

    /**
     * 状态
     */
    @JsonView({OnlyHintView.class, AllView.class})
    private String status;

    /**
     * 状态文本
     */
    @JsonView({OnlyHintView.class, AllView.class})
    private String text;

    /**
     * 描述
     */
    @JsonView({OnlyHintView.class, AllView.class})
    private String description;

    /**
     * 内容
     */
    @JsonView({OnlyObjectView.class, AllView.class})
    private T t;


    /**
     * 服务器时间
     */
    @JsonView({OnlyHintView.class, AllView.class})
    private Long serverTime;


    public Results() {
        this.status = StatusCode.SUCCESS.name();
        this.text = StatusCode.SUCCESS.value();
        this.description = StatusCode.SUCCESS.value();
        this.serverTime = new Date().getTime();
    }

    public Results(T t) {
        this.status = StatusCode.SUCCESS.name();
        this.text = StatusCode.SUCCESS.value();
        this.description = StatusCode.SUCCESS.value();
        this.serverTime = new Date().getTime();
        this.t = t;
    }

    public Results(StatusCode statusCode, String description) {
        this.status = statusCode.name();
        this.text = statusCode.value();
        this.description = description;
        this.serverTime = new Date().getTime();
    }

    public Results(String status, String text, String description) {
        this.status = status;
        this.text = text;
        this.description = description;
        this.serverTime = new Date().getTime();
    }

    public Results(String status, String text, T t) {
        this.status = status;
        this.text = text;
        this.serverTime = new Date().getTime();
        this.t = t;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", text='" + text + '\'' +
                ", description='" + description + '\'' +
                ", t=" + t +
                '}';
    }
}