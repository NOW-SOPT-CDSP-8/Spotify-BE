package com.example.spotifyweb.global.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    //404
    STATION_NOT_FOUND_BY_ID_EXCEPTION(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 스테이션이 존재하지 않습니다."),

    //400
    ;

    private final int status;
    private final String message;
}