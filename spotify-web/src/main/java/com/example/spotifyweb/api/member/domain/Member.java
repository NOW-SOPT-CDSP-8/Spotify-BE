package com.example.spotifyweb.api.member.domain;

import com.example.spotifyweb.api.card.domain.Card;
import com.example.spotifyweb.global.common.entitiy.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "members")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"memberId\"")
    private Long id;

    @Column(length = 30, nullable = false, name = "\"memberName\"")
    private String memberName;

    @Column(nullable = false)
    private boolean isSubscribed;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"cardId\"", nullable = false)
    private Card card;

}
