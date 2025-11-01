package com.ashish.restaurant.exceptions;

public class BaseExecption extends RuntimeException{

    public BaseExecption() {
    }

    public BaseExecption(String message) {
        super(message);
    }

    public BaseExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseExecption(Throwable cause) {
        super(cause);
    }
}
