package com.example.spotifyweb.global.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    //404

    //400
    STATION_NOT_FOUND_BY_ID_EXCEPTION(HttpStatus.BAD_REQUEST.value(), "ID에 해당하는 스테이션이 존재하지 않습니다."),
    MEMBER_NOT_FOUND_BY_ID_EXCEPTION(HttpStatus.BAD_REQUEST.value(), "ID에 해당하는 멤버가 존재하지 않습니다."),
    DUPLICATION_STATION_LIKE(HttpStatus.BAD_REQUEST.value(), "해당하는 회원이 이미 좋아요를 한 스테이션입니다.");

    private final int status;
    private final String message;
}