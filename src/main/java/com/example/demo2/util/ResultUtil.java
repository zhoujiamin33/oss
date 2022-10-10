package com.example.demo2.util;


import com.example.demo2.model.Result;

/**
 * 返回结果工具类
 *
 * @author lili
 */
public class ResultUtil<T> {
    /**
     * 抽象类，存放结果
     */
    private final Result<T> result;
    /**
     * 正常响应
     */
    private static final String SUCCESS_CODE = "200";
    private static final String SUCCESS_MSG = "成功";

    private static final String FAIL_CODE = "500";
    private static final String FAIL_MSG = "失败";


    /**
     * 构造话方法，给响应结果默认值
     */
    public ResultUtil() {
        result = new Result<>();
        result.setSuccess(true);
        result.setMessage(SUCCESS_MSG);
        result.setCode(SUCCESS_CODE);
    }

    /**
     * 抽象静态方法，返回结果集
     * @param t 范型
     * @param <T>  范型
     * @return 消息
     */
    public static <T> Result<T> data(T t) {
        return new ResultUtil<T>().setData(t);
    }

    /**
     * 返回成功
     * @return 消息
     */
    public static <T> Result<T> success() {
        return new ResultUtil<T>().setSuccessMsg(SUCCESS_MSG);
    }

    /**
     * 返回成功
     *
     * @param successMsg
     * @return 消息
     */
    public static <T> Result<T> success(String successMsg) {
        return new ResultUtil<T>().setSuccessMsg(successMsg);
    }

    /**
     * 返回失败
     *
     * @return 消息
     */
    public static <T> Result<T> error() {
        return new ResultUtil<T>().setErrorMsg(FAIL_MSG);
    }

    /**
     * 返回失败
     *
     * @param errorMsg 返回状态码
     * @return 消息
     */
    public static <T> Result<T> error(String errorMsg) {
        return new ResultUtil<T>().setErrorMsg(errorMsg);
    }

    /**
     * 返回失败
     *
     * @param code 状态码
     * @param msg  返回消息
     * @return 消息
     */
    public static <T> Result<T> error(String code, String msg) {
        return new ResultUtil<T>().setErrorMsg(code, msg);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回码
     * @return 返回成功消息
     */
    public Result<T> setSuccessMsg(String msg) {
        this.result.setSuccess(true);
        this.result.setMessage(msg);
        this.result.setCode(SUCCESS_CODE);
        return this.result;

    }

    /**
     * 服务器异常 追加状态码
     * @param errorMsg 返回码
     * @return 消息
     */
    public Result<T> setErrorMsg(String errorMsg) {
        this.result.setSuccess(false);
        this.result.setMessage(errorMsg);
        this.result.setCode(FAIL_CODE);
        return this.result;
    }

    /**
     * 服务器异常 追加状态码
     *
     * @param code 状态码
     * @param msg  返回消息
     * @return 消息
     */
    public Result<T> setErrorMsg(String code, String msg) {
        this.result.setSuccess(false);
        this.result.setMessage(msg);
        this.result.setCode(code);
        return this.result;
    }

    /**
     * 返回数据
     *
     * @param t 范型
     * @return 消息
     */
    public Result<T> setData(T t) {
        this.result.setData(t);
        return this.result;
    }

}
