package com.example.spotifyweb.api.stationMusic;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationMusicRepository extends JpaRepository<StationMusic, Long> {

    List<StationMusic> findFirst5ByStationIdOrderByIdAsc(Long stationId);

    List<StationMusic> findTop5ByStationIdAndMusicIdGreaterThanOrderByIdAsc(Long stationId, Long cursor);
}
