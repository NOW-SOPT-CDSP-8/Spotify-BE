package com.example.spotifyweb.global.common.exception;

import com.example.spotifyweb.global.common.response.ErrorMessage;

public class NotFoundException extends BusinessException {
    public NotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}