package com.example.project_hansol.domain.member.service;

import com.example.project_hansol.domain.member.model.Member;

import java.util.List;

public interface MemberService {

    List<Member> findAllMembers();

}