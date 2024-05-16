package com.example.spotifyweb.stationMusic;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationMusicRepository extends JpaRepository<StationMusic, Long> {

    List<StationMusic> findFirst5ByStationIdOrderByIdAsc(Long stationId);
    List<StationMusic> findTop5ByStationIdAndIdGreaterThanOrderByIdAsc(Long stationId, Long cursor);
}
