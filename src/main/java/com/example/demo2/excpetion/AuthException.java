package com.example.demo2.excpetion;

import com.example.demo2.enums.StatusCode;

/**
 * @author Tina
 */
public class AuthException extends ServiceException {

    public AuthException() {
        super();
    }

    public AuthException(StatusCode statusCode) {
        super(statusCode);
    }
}
