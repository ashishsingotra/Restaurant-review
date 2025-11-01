package com.ashish.restaurant.exceptions;

public class StorageExecption extends BaseExecption{

    public StorageExecption() {
    }

    public StorageExecption(String message) {
        super(message);
    }

    public StorageExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageExecption(Throwable cause) {
        super(cause);
    }
}
