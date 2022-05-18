package com.example.project_hansol.api.member.dto;

import com.example.project_hansol.domain.member.model.Member;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberDto {

    @Schema(description = "회원 아이디", example = "1")
    private Long memberId;

    @Schema(description = "회원 이름", example = "김정근")
    private String memberName;

    public static MemberDto of(Member member) {
        return MemberDto.builder()
                .memberId(member.getMemberId())
                .memberName(member.getMemberName())
                .build();
    }

}