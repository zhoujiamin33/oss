package com.example.demo2.excpetion;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo2.model.Result;
import com.example.demo2.util.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Tina
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 如果超过长度，则前后段交互体验不佳，使用默认错误消息
     */
    static Integer MAX_LENGTH = 200;

    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<Object> validExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        BindException exception = (BindException) e;
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            return ResultUtil.error(error.getDefaultMessage());
        }
        return ResultUtil.error(ParamResultEnum.ERROR.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<Object> methodArgumentNotValidExceptionHandler(HttpServletRequest request, final MethodArgumentNotValidException e, HttpServletResponse response) {

        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            return ResultUtil.error(error.getDefaultMessage());
        }
        return ResultUtil.error(ParamResultEnum.ERROR.getMessage());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<Object> missingServletRequestParameterException(HttpServletRequest request, final MissingServletRequestParameterException e, HttpServletResponse response) {

        return ResultUtil.error(String.format("%s%s", e.getParameterName(), ParamResultEnum.MISS.getMessage()));
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<Object> missingServletRequestParameterException(HttpServletRequest request, final HttpRequestMethodNotSupportedException e, HttpServletResponse response) {

        return ResultUtil.error("请求方式错误");
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<Object> httpMessageNotReadableExceptionHandler(HttpServletRequest request, final HttpMessageNotReadableException e, HttpServletResponse response) {

        return ResultUtil.error(ParamResultEnum.NO_BODY.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Result<Object> runtimeExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        log.error("全局异常[RuntimeException]:{}", e);
        return ResultUtil.error(e.getMessage());
    }

    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Result<Object> handleServiceException(HttpServletRequest request, final ServiceException serviceException, HttpServletResponse response) {
        log.error("全局异常[ServiceException]:{}", serviceException.getMsg());
        return ResultUtil.error(serviceException.getErrorCode(), serviceException.getMsg());
    }

//    @ExceptionHandler(NotLoginException.class)
//    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
//    public Result<Object> notLoginException(HttpServletRequest request, final NotLoginException e, HttpServletResponse response) {
//        log.error("[NotLoginException]:{}", e);
//        return ResultUtil.error(DefaultResultEnum.UN_LOGIN.getCode(), DefaultResultEnum.UN_LOGIN.getMessage());
//    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Result<Object> handleIllegalArgumentException(HttpServletRequest request, final IllegalArgumentException e, HttpServletResponse response) {
        log.error("全局异常[IllegalArgumentException]:{}", e);
        return ResultUtil.error(String.valueOf(HttpStatus.BAD_REQUEST.value()), e.getMessage());
    }

}
