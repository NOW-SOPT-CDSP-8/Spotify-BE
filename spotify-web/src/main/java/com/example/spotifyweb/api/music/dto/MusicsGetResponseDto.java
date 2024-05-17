package com.example.spotifyweb.api.music.dto;

import com.example.spotifyweb.api.playlist.dto.PlaylistInfo;
import java.util.List;

public record MusicsGetResponseDto(
        List<PlaylistInfo> playlists,
        List<MusicInfo> musics) {
}