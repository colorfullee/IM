package com.yrw.im.common.domain;

/**
 * Date: 2019-04-21
 * Time: 22:19
 *
 * @author yrw
 */
public class ResultWrapper<T> {

    private final static String SUCCESS = "SUCCESS";

    private Integer status;
    private String msg;
    private T data;

    public ResultWrapper() {
    }

    public ResultWrapper(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResultWrapper<T> success() {
        ResultWrapper<T> resultWrapper = new ResultWrapper<>();
        resultWrapper.setStatus(200);
        resultWrapper.setMsg(SUCCESS);

        return resultWrapper;
    }

    public static <T> ResultWrapper<T> success(T data) {
        ResultWrapper<T> resultWrapper = success();
        resultWrapper.setData(data);
        return resultWrapper;
    }


    public static ResultWrapper fail(String message) {
        ResultWrapper resultWrapper = new ResultWrapper();
        resultWrapper.setStatus(500);
        resultWrapper.setMsg(message);
        return resultWrapper;
    }

    public Integer getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}