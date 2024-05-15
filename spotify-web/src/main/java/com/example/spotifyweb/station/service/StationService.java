package com.example.spotifyweb.station.service;

import com.example.spotifyweb.station.domain.Station;
import com.example.spotifyweb.station.dto.StationFindDto;
import com.example.spotifyweb.station.repository.StationsRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class StationService {

    private final StationsRepository stationsRepository;
    public List<StationFindDto> getStations() {
        List<Station> stations = stationsRepository.findAll();
        return stations.stream()
                .map(StationFindDto::of)
                .collect(Collectors.toList());
    }

}
