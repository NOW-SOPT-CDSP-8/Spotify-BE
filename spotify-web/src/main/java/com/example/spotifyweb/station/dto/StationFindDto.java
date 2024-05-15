package com.example.spotifyweb.station.dto;

import com.example.spotifyweb.station.domain.Station;
public record StationFindDto(Long stationId, String stationTitle){
    public static StationFindDto of (Station station){
        return new StationFindDto(station.getId(), station.getStationTitle());
    }
}
