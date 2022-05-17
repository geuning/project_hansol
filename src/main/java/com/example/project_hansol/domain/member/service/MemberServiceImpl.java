package com.example.project_hansol.domain.member.service;

import com.example.project_hansol.domain.member.model.Member;
import com.example.project_hansol.domain.member.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public List<Member> findAllMembers() {
        return memberMapper.findAllMembers();
    }

}