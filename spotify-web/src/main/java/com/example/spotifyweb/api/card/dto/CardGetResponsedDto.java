package com.example.spotifyweb.api.card.dto;

import com.example.spotifyweb.api.card.domain.Card;
import com.example.spotifyweb.api.card.domain.CardCategory;

public record CardGetResponsedDto(String cardName, CardCategory cardType, String cardNumber) {
    public static CardGetResponsedDto of(Card card) {
        return new CardGetResponsedDto(card.getCardName(), card.getCardType(), card.getCardNumber());
    }
}
