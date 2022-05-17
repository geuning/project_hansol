package com.example.project_hansol.api.member.controller;

import com.example.project_hansol.api.member.dto.MemberDto;
import com.example.project_hansol.domain.member.model.Member;
import com.example.project_hansol.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public List<MemberDto> findAllMembers() {
        List<Member> allMembers = memberService.findAllMembers();
        List<MemberDto> memberDtos = allMembers.stream().map(member -> MemberDto.of(member)).collect(Collectors.toList());
        return memberDtos;
    }

}