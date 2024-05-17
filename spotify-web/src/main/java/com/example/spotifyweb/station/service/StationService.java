package com.example.spotifyweb.station.service;

import com.example.spotifyweb.global.common.exception.NotFoundException;
import com.example.spotifyweb.global.common.response.ErrorMessage;
import com.example.spotifyweb.member.domain.Member;
import com.example.spotifyweb.member.repository.MemberRepository;
import com.example.spotifyweb.station.domain.Station;
import com.example.spotifyweb.station.domain.StationLiking;
import com.example.spotifyweb.station.dto.StationGetResponseDto;
import com.example.spotifyweb.station.repository.StationLikingRepository;
import com.example.spotifyweb.station.repository.StationRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StationService {

    private final StationRepository stationsRepository;
    private final MemberRepository memberRepository;
    private final StationLikingRepository stationLikingRepository;

    public List<StationGetResponseDto> getStations() {

        List<Station> stations = stationsRepository.findAll();
        return stations.stream().map(StationGetResponseDto::of).collect(Collectors.toList());
    }

    public void postStationLiking(Long memberId, Long stationId) {

        Station station = stationsRepository.findByIdOrThrow(stationId);
        Member member = memberRepository.findByIdOrThrow(memberId);

        StationLiking stationLiking = StationLiking.builder()
                .station(station)
                .member(member)
                .build();

        isDuplicateStationLiking(member, station);
        stationLikingRepository.save(stationLiking);
    }

    private void isDuplicateStationLiking(Member member, Station station) {
        if (stationLikingRepository.existsByMemberAndStation(member, station)) {
            throw new NotFoundException(ErrorMessage.DUPLICATION_STATION_LIKE);
        }
    }
}