package com.example.spotifyweb.station.domain;

import com.example.spotifyweb.global.common.entitiy.BaseTimeEntity;
import com.example.spotifyweb.member.domain.Member;
import com.example.spotifyweb.music.domain.Music;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "stations")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class Station extends BaseTimeEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"stationId\"")
    private Long id;

    @Column(length = 30, nullable = false, name = "\"stationTitle\"")
    private String stationTitle;


    @ManyToMany
    @JoinTable(name = "station_music",

            joinColumns = @JoinColumn(name = "\"stationId\"", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "\"musicId\"", nullable = false))
    private List<Music> musics = new ArrayList<>();




}
