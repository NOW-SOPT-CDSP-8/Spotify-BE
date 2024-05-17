package com.example.spotifyweb.api.music.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder(access = AccessLevel.PRIVATE)
public class MusicInfo {

    private final String musicTitle;
    private final String singer;
    private final Long musicLikings;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private final LocalDate musicReleaseDate;

    public static MusicInfo of(String musicTitle, String singer, long musicLikings, LocalDate musicReleaseDate) {
        return MusicInfo.builder()
                .musicTitle(musicTitle)
                .singer(singer)
                .musicLikings(musicLikings)
                .musicReleaseDate(musicReleaseDate)
                .build();
    }
}
