package com.example.spotifyweb.api.music.repository;

import com.example.spotifyweb.api.music.domain.GenreCategory;
import com.example.spotifyweb.api.music.domain.Music;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MusicRepository extends JpaRepository<Music, Long> {

    @Query("SELECT m FROM Music m WHERE m.genreTitle = :genre AND m.musicReleaseDate BETWEEN :startDate AND :endDate")
    List<Music> findMusicsByGenreAndFilter(GenreCategory genre, LocalDate startDate, LocalDate endDate);
}
