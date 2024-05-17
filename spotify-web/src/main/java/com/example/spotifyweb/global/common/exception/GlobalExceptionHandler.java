package com.example.spotifyweb.global.common.exception;

import com.example.spotifyweb.global.common.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NotFoundException.class)
    protected ApiResponse handleNotFoundException(NotFoundException e) {
        return ApiResponse.error(
                e.getErrorMessage().getStatus(),
                e.getErrorMessage().getMessage()
        );
    }
}