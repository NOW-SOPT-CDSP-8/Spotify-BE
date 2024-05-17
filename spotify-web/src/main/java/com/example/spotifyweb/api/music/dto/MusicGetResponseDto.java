package com.example.spotifyweb.api.music.dto;

import com.example.spotifyweb.api.music.domain.Music;

public record MusicGetResponseDto(Long musicId, String musicTitle, String singer) {
    public static MusicGetResponseDto of(Music music) {

        return new MusicGetResponseDto(music.getId(), music.getMusicTitle(), music.getSinger());
    }
}
