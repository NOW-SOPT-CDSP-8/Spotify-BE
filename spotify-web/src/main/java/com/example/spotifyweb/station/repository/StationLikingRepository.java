package com.example.spotifyweb.station.repository;

import com.example.spotifyweb.member.domain.Member;
import com.example.spotifyweb.station.domain.Station;
import com.example.spotifyweb.station.domain.StationLiking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationLikingRepository extends JpaRepository<StationLiking, Long> {
    Boolean existsByMemberAndStation(Member member, Station station);
}