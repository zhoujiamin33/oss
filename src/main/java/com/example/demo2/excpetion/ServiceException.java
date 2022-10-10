package com.example.demo2.excpetion;

import com.example.demo2.enums.StatusCode;

/**
 * 业务异常基类
 * @author Tina
 */
public class ServiceException extends RuntimeException {

    /**
     * 异常消息
     */
    private String msg;
    /**
     * 错误码
     */
    private String errorCode;

    public ServiceException() {
        super();
        this.errorCode = DefaultResultEnum.ERROR.getCode();
        this.msg = DefaultResultEnum.ERROR.getMessage();
    }

    public ServiceException(StatusCode statusCode) {
        super();
        this.errorCode = statusCode.getCode();
        this.msg = statusCode.getMessage();
    }

    public ServiceException(String msg) {
        super();
        this.errorCode = DefaultResultEnum.ERROR.getCode();
        this.msg = msg;
    }

    public ServiceException(String errorCode, String msg) {
        super("[" + errorCode + "]" + ":" + msg);
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
