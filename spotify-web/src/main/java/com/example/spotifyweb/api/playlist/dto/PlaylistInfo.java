package com.example.spotifyweb.api.playlist.dto;

import com.example.spotifyweb.api.playlist.domain.Playlist;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder(access = AccessLevel.PRIVATE)
public class PlaylistInfo {
    private final String playlistTitle;
    private final int followers;

    public static PlaylistInfo of(final Playlist playlist) {
        return PlaylistInfo.builder()
                .playlistTitle(playlist.getPlaylistTitle())
                .followers(playlist.getFollowers())
                .build();
    }
}
