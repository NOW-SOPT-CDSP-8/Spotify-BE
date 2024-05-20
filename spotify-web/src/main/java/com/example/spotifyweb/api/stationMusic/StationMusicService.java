package com.example.spotifyweb.api.stationMusic;

import com.example.spotifyweb.api.music.dto.MusicGetResponseDto;
import com.example.spotifyweb.api.station.repository.StationRepository;
import com.example.spotifyweb.global.common.exception.NotFoundException;
import com.example.spotifyweb.global.common.response.ErrorMessage;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StationMusicService {

    private final StationMusicRepository stationMusicRepository;

    private final StationRepository stationsRepository;

    public List<MusicGetResponseDto> getMusicByStationIdWithCursor(Long stationId, Long cursor) {

        // 존재하지 않는 stationId 이면 NotFoundException
        stationsRepository.findById(stationId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.STATION_NOT_FOUND_BY_ID_EXCEPTION)
        );

        List<StationMusic> stationMusics;

        if (cursor == -1) {
            // cursor 값이 -1인 경우 특정 stationId에 해당하는 StationMusic을 PK기준으로 오름차순 정렬하고, 처음 5개의 결과를 반환합니다.
            stationMusics = stationMusicRepository.findFirst5ByStationIdOrderByIdAsc(stationId);
        } else {
            // 특정 stationId에 해당하는 StationMusic을 PK기준으로 오름차순 정렬하고, PK > cursor 인 최대 5개의 결과를 반환합니다.
            stationMusics = stationMusicRepository.findTop5ByStationIdAndMusicIdGreaterThanOrderByIdAsc(stationId,
                    cursor);
        }

        return stationMusics.stream().map(stationMusic -> MusicGetResponseDto.of(stationMusic.getMusic()))
                .collect(Collectors.toList());
    }
}
