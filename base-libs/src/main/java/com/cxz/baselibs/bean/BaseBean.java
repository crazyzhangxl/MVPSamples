package com.cxz.baselibs.bean;

/**
 * @author chenxz
 * @date 2018/11/21
 * @desc
 */
public class BaseBean<T> {
    private int errorCode;
    private String errorMsg;
    private T data;

    public BaseBean() {
    }

    public BaseBean(int errorCode, String errorMsg, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
