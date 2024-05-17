package com.example.spotifyweb.api.station.repository;

import com.example.spotifyweb.api.member.domain.Member;
import com.example.spotifyweb.api.station.domain.Station;
import com.example.spotifyweb.api.station.domain.StationLiking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationLikingRepository extends JpaRepository<StationLiking, Long> {

    Boolean existsByMemberAndStation(Member member, Station station);

    void deleteByMemberAndStation(Member member, Station station);
}