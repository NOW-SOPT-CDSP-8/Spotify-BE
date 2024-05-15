package com.example.spotifyweb.station.repository;

import com.example.spotifyweb.station.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationsRepository extends JpaRepository<Station, Long> {
}
