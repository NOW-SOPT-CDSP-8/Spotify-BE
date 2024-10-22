package com.example.spotifyweb.global.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {

    //200
    GET_STATIONS_SUCCESS(HttpStatus.OK.value(), "스테이션 제목 조회 성공"),
    GET_MUSICS_SUCCESS(HttpStatus.OK.value(), "스테이션에 따른 노래 리스트 조회 성공"),
    DELETE_STATION_LIKING_SUCCESS(HttpStatus.OK.value(), "스테이션 좋아요 취소 성공"),
    GET_MUSICS_BY_GENRE_AND_FILTER_SUCCESS(HttpStatus.OK.value(), "장르와 필터에 다른 노래 리스트 조회 성공"),
    GET_PROFILE_SUCCESS(HttpStatus.OK.value(), "프로필 조회 성공"),
    //201
    POST_STATION_LIKING_SUCCESS(HttpStatus.CREATED.value(), "스테이션 좋아요 성공")

    //202
    ;
    private final int status;
    private final String message;
}

