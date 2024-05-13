package com.example.spotifyweb.music.domain;


import com.example.spotifyweb.music.GenreCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "musics")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"musicId\"")
    private Long id;

    @Column(length = 30, nullable = false, name = "\"musicTitle\"")
    private String musicTitle;

    @Column(length = 30, nullable = false)
    private String singer;

    @Column(nullable = false, name = "\"musicLikings\"")
    private Long musicLikings = 0L;

    @Column(nullable = false, name = "\"musicReleaseDate\"")
    private LocalDate musicReleaseDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "\"genreTitle\"")
    private GenreCategory genreTitle;

}
