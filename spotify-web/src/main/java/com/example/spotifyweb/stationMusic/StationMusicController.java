package com.example.spotifyweb.stationMusic;

import com.example.spotifyweb.global.common.response.ApiResponse;
import com.example.spotifyweb.global.common.response.SuccessMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StationMusicController {

    private final StationMusicService stationMusicService;

    @GetMapping("/api/v1/{stationId}/musics")
    public ApiResponse getMusics(@RequestHeader Long memberId, @PathVariable Long stationId, @RequestParam Long cursor) {

        return ApiResponse.success(SuccessMessage.GET_MUSICS_SUCCESS.getStatus(), SuccessMessage.GET_MUSICS_SUCCESS.getMessage(), stationMusicService.getMusicByStationIdWithCursor(stationId, cursor));
    }
}
