package com.example.spotifyweb.api.station.controller;

import com.example.spotifyweb.api.station.service.StationService;
import com.example.spotifyweb.global.common.response.ApiResponse;
import com.example.spotifyweb.global.common.response.SuccessMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StationController {

    private final StationService stationService;

    @GetMapping("/api/v1/stations")
    public ApiResponse getStations(@RequestHeader(value = "memberId") Long memberId) {

        return ApiResponse.success(SuccessMessage.GET_STATIONS_SUCCESS.getStatus(),
                SuccessMessage.GET_STATIONS_SUCCESS.getMessage(), stationService.getStations());
    }

    @PostMapping("/api/v1/{staionId}/liked")
    public ApiResponse postStationLiking(@RequestHeader(value = "memberId") Long memberId,
                                         @PathVariable("staionId") Long staionId) {
        stationService.postStationLiking(memberId, staionId);
        return ApiResponse.success(SuccessMessage.POST_STATION_LIKING_SUCCESS.getStatus(),
                SuccessMessage.POST_STATION_LIKING_SUCCESS.getMessage());
    }

    @DeleteMapping("/api/v1/{staionId}/unliked")
    public ApiResponse deleteStation(@RequestHeader(value = "memberId") Long memberId,
                                     @PathVariable("staionId") Long staionId) {
        stationService.deleteStationLiking(memberId, staionId);
        return ApiResponse.success(SuccessMessage.DELETE_STATION_LIKING_SUCCESS.getStatus(),
                SuccessMessage.DELETE_STATION_LIKING_SUCCESS.getMessage());
    }
}
