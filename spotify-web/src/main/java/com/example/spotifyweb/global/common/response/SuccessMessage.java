package com.example.spotifyweb.global.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {

    //200
    GET_STATIONS_SUCCESS(HttpStatus.OK.value(),"스테이션 제목 조회 성공"),
    GET_MUSICS_SUCCESS(HttpStatus.OK.value(), "스테이션에 따른 노래 리스트 조회 성공");
    //202

    private final int status;
    private final String message;
}

