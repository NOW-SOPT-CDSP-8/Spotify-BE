package com.example.spotifyweb.global.common.exception;

import com.example.spotifyweb.global.common.response.ErrorMessage;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private ErrorMessage errorMessage;

    public BusinessException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }

}

