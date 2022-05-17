package com.example.project_hansol.api.member.dto;

import com.example.project_hansol.domain.member.model.Member;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "회원 조회 model")
@Getter
@Setter
@Builder
public class MemberDto {

    @ApiModelProperty(value = "회원 아이디", example = "1")
    private Long memberId;

    @ApiModelProperty(value = "회원 이름", example = "김정근")
    private String memberName;

    public static MemberDto of(Member member) {
        return MemberDto.builder()
                .memberId(member.getMemberId())
                .memberName(member.getMemberName())
                .build();
    }

}