package com.example.spotifyweb.global.common.exception;

import com.example.spotifyweb.global.common.response.ApiResponse;
import com.example.spotifyweb.global.common.response.ErrorMessage;
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
                ErrorMessage.STATION_NOT_FOUND_BY_ID_EXCEPTION.getStatus(),
                ErrorMessage.STATION_NOT_FOUND_BY_ID_EXCEPTION.getMessage()
        );
    }

}