package com.example.demo2.excpetion;


import com.example.demo2.enums.StatusCode;

/**
 * @author Tina
 */

public enum DefaultResultEnum implements StatusCode {
    /**
     * 成功状态码
     */
    SUCCESS("200", "成功"),
    /**
     * 失败返回码
     */
    ERROR("500", "操作异常"),

    UN_LOGIN("401", "未登录"),
    ;
    private final String code;
    private final String message;
    DefaultResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
