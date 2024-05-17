package com.example.spotifyweb.api.music.service;

import com.example.spotifyweb.api.filter.domain.Filter;
import com.example.spotifyweb.api.filter.filterRepository.FilterRepository;
import com.example.spotifyweb.api.music.domain.GenreCategory;
import com.example.spotifyweb.api.music.domain.Music;
import com.example.spotifyweb.api.music.dto.MusicInfo;
import com.example.spotifyweb.api.music.dto.MusicsGetResponseDto;
import com.example.spotifyweb.api.music.repository.MusicRepository;
import com.example.spotifyweb.api.playlist.domain.Playlist;
import com.example.spotifyweb.api.playlist.dto.PlaylistInfo;
import com.example.spotifyweb.api.playlist.repository.PlaylistRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MusicService {

    private final PlaylistRepository playlistRepository;
    private final MusicRepository musicRepository;
    private final FilterRepository filterRepository;

    public MusicsGetResponseDto getMusicsByGenreAndFilter(GenreCategory genre, Long filterId) {
        List<Playlist> playlists = playlistRepository.findAll();

        List<PlaylistInfo> playlistInfos = playlists.stream()
                .map(PlaylistInfo::of)
                .toList();

        Filter filter = filterRepository.findByIdOrThrow(filterId);
        List<Music> musics = musicRepository.findMusicsByGenreAndFilter(genre, filter.getStartDate(),
                filter.getEndDate());

        List<MusicInfo> musicInfos = musics.stream()
                .map(oneMusic -> MusicInfo.of(oneMusic.getMusicTitle(),
                        oneMusic.getSinger(),
                        oneMusic.getMusicLikings(),
                        oneMusic.getMusicReleaseDate()))
                .toList();

        return new MusicsGetResponseDto(playlistInfos, musicInfos);
    }
}
