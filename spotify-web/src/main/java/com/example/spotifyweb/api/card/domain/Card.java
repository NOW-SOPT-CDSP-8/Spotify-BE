package com.example.spotifyweb.api.card.domain;

import com.example.spotifyweb.global.common.entitiy.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cards")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class Card extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"cardId\"")
    private Long id;

    @Column(length = 30, nullable = false, name = "\"cardName\"")
    private String cardName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "\"cardType\"")
    private CardCategory cardType; //카드 타입 [신용, 체크]

    @Column(length = 4, nullable = false, name = "\"cardNumber\"")
    private String cardNumber;

}
