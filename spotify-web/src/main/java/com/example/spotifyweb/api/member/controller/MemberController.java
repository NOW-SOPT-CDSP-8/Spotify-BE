package com.example.spotifyweb.api.member.controller;

import com.example.spotifyweb.api.member.service.MemberService;
import com.example.spotifyweb.global.common.response.ApiResponse;
import com.example.spotifyweb.global.common.response.SuccessMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/api/v1/profile")
    public ApiResponse getProfile(@RequestHeader(value = "memberId") Long memberId) {

        return ApiResponse.success(SuccessMessage.GET_PROFILE_SUCCESS.getStatus(),
                SuccessMessage.GET_PROFILE_SUCCESS.getMessage(), memberService.getMemberProfile(memberId));
    }
}
