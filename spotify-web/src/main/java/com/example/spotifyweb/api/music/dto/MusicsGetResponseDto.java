package com.example.spotifyweb.api.music.dto;

import com.example.spotifyweb.api.playlist.dto.PlaylistInfo;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MusicsGetResponseDto {
    private final List<PlaylistInfo> playlists;
    private final List<MusicInfo> musics;
}
