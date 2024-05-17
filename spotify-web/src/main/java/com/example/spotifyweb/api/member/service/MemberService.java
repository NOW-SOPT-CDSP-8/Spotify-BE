package com.example.spotifyweb.api.member.service;

import com.example.spotifyweb.api.member.dto.ProfileGetResponsedDto;
import com.example.spotifyweb.api.member.repository.MemberRepository;
import com.example.spotifyweb.global.common.exception.NotFoundException;
import com.example.spotifyweb.global.common.response.ErrorMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public ProfileGetResponsedDto getMemberProfile(Long memberId) {

        return ProfileGetResponsedDto.of(memberRepository.findById(memberId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.MEMBER_NOT_FOUND_BY_ID_EXCEPTION)
        ));
    }
}
