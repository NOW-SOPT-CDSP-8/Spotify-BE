package com.example.spotifyweb.api.playlist.repository;

import com.example.spotifyweb.api.playlist.domain.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
