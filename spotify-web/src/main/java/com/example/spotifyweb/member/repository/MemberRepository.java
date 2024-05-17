package com.example.spotifyweb.member.repository;

import com.example.spotifyweb.global.common.exception.NotFoundException;
import com.example.spotifyweb.global.common.response.ErrorMessage;
import com.example.spotifyweb.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    default Member findByIdOrThrow(Long memberId) throws NotFoundException {
        return findById(memberId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.MEMBER_NOT_FOUND_BY_ID_EXCEPTION));
    }
}