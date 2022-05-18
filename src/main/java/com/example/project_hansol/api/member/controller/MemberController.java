package com.example.project_hansol.api.member.controller;

import com.example.project_hansol.api.member.dto.MemberDto;
import com.example.project_hansol.domain.member.model.Member;
import com.example.project_hansol.domain.member.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Tag(name="MemberController", description = "회원 API")
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @Operation(summary = "전체 회원 조회", description = "전체 회원을 조회합니다.")
    @GetMapping
    public List<MemberDto> findAllMembers() {
        List<Member> allMembers = memberService.findAllMembers();
        List<MemberDto> memberDtos = allMembers.stream().map(member -> MemberDto.of(member)).collect(Collectors.toList());
        return memberDtos;
    }

}