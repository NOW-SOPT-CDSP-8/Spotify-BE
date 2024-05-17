package com.example.spotifyweb.station.repository;

import com.example.spotifyweb.global.common.exception.NotFoundException;
import com.example.spotifyweb.global.common.response.ErrorMessage;
import com.example.spotifyweb.station.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {

    default Station findByIdOrThrow(Long stationId) throws NotFoundException {
        return findById(stationId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.STATION_NOT_FOUND_BY_ID_EXCEPTION));
    }
}
