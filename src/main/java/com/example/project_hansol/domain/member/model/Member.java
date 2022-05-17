package com.example.project_hansol.domain.member.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Member {

    private Long memberId;
    private String memberName;

}