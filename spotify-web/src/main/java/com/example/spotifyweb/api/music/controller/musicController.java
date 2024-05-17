package com.example.spotifyweb.api.music.controller;

import com.example.spotifyweb.api.music.domain.GenreCategory;
import com.example.spotifyweb.api.music.service.MusicService;
import com.example.spotifyweb.global.common.response.ApiResponse;
import com.example.spotifyweb.global.common.response.SuccessMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/musics")
public class musicController {

    private final MusicService musicService;

    @GetMapping("/filter/{filterId}")
    public ApiResponse getMusics(@RequestHeader(value = "memberId") Long memberId,
                                 @RequestParam(name = "genre") GenreCategory genre,
                                 @PathVariable(name = "filterId") Long filterId) {
        return ApiResponse.success(SuccessMessage.GET_MUSICS_BY_GENRE_AND_FILTER_SUCCESS.getStatus(),
                SuccessMessage.GET_MUSICS_BY_GENRE_AND_FILTER_SUCCESS.getMessage(),
                musicService.getMusicsByGenreAndFilter(genre, filterId));
    }
}
