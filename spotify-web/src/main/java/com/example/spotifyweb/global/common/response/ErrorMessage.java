package com.example.spotifyweb.global.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    //404

    //400
    ;

    private final int status;
    private final String message;
}