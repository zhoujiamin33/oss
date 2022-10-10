package com.example.demo2.excpetion;


import com.example.demo2.enums.StatusCode;

/**
 * <h1>通用参数异常码</h1>
 * @author Tina
 */
public enum ParamResultEnum implements StatusCode {

    /**
     * 参数返回码
     */
    ERROR("50000", "参数异常"),
    MISS("50001", "参数缺失"),
    NO_BODY("50002", "BODY体为空");
    private final String code;
    private final String message;
    ParamResultEnum(String code, String message) {
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
