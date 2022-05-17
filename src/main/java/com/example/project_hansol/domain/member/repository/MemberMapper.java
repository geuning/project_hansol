package com.example.project_hansol.domain.member.repository;

import com.example.project_hansol.domain.member.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> findAllMembers();

}