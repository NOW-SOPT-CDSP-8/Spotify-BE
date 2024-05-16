package com.example.spotifyweb.station.dto;

import com.example.spotifyweb.station.domain.Station;
public record  StationGetResponseDto(Long stationId, String stationTitle){
    public static  StationGetResponseDto of (Station station){

        return new StationGetResponseDto(station.getId(), station.getStationTitle());
    }
}
