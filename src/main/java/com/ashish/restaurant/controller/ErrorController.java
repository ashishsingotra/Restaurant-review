package com.ashish.restaurant.controller;

import com.ashish.restaurant.domain.dtos.ErrorDto;
import com.ashish.restaurant.exceptions.BaseExecption;
import com.ashish.restaurant.exceptions.StorageExecption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
@Slf4j
public class ErrorController {

    @ExceptionHandler(StorageExecption.class)
    public ResponseEntity<ErrorDto> handleStorageException(StorageExecption ex){
        log.error("Caught StorageException", ex);

        ErrorDto errorDto = ErrorDto.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message("unable to save or retrieve resources at this time")
                .build();

        return new ResponseEntity<>(errorDto , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BaseExecption.class)
    public ResponseEntity<ErrorDto> handleBaseException(BaseExecption ex){
        log.error("Caught unexpected exception", ex);

        ErrorDto errorDto = ErrorDto.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message("An unexpected error occurred")
                .build();

        return new ResponseEntity<>(errorDto , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> handleException(Exception ex){
        log.error("Caught unexpected exception", ex);

        ErrorDto errorDto = ErrorDto.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message("An unexpected error occurred")
                .build();

        return new ResponseEntity<>(errorDto , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
