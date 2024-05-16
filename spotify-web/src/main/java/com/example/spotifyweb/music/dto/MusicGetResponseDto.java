package com.example.spotifyweb.music.dto;

import com.example.spotifyweb.music.domain.Music;

public record MusicGetResponseDto(Long musicId, String musicTitle, String singer) {
    public static MusicGetResponseDto of (Music music){

        return new MusicGetResponseDto(music.getId(), music.getMusicTitle(), music.getSinger());
    }
}
