package com.example.spotifyweb.api.playlist.domain;

import com.example.spotifyweb.global.common.entitiy.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "playlists")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Playlist extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playlistId;

    @Column(length = 30, nullable = false)
    private String playlistTitle;

    @Column(nullable = false)
    private int followers;

    @Builder
    public Playlist(String playlistTitle, int followers) {
        this.playlistTitle = playlistTitle;
        this.followers = followers;
    }
}

