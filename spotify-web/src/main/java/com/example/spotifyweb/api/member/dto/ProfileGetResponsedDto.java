package com.example.spotifyweb.api.member.dto;

import com.example.spotifyweb.api.card.dto.CardGetResponsedDto;
import com.example.spotifyweb.api.member.domain.Member;

public record ProfileGetResponsedDto(String memberName, Boolean isSubscribe, CardGetResponsedDto card) {
    public static ProfileGetResponsedDto of(Member member) {
        return new ProfileGetResponsedDto(member.getMemberName(), member.isSubscribed(),
                CardGetResponsedDto.of(member.getCard()));
    }
}
