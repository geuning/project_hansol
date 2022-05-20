package com.example.project_hansol.api.company.dto;

import com.example.project_hansol.domain.company.model.Company;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class CompanyDto {

    @Getter
    @Setter
    @Builder
    public static class Response{

        @Schema(description = "회사 아이디", example = "99999")
        private Long companyId;

        @Schema(description = "생성 시간")
        private LocalDateTime createTime;

        @Schema(description = "수정 시간")
        private LocalDateTime updateTime;

        @Schema(description = "회사명", example = "한솔")
        private String companyName;

        @Schema(description = "삭제여부", example = "0")
        private Boolean isDeleted;

        public static CompanyDto.Response of(Company company){
            return Response.builder()
                    .companyId(company.getCompanyId())
                    .createTime(company.getCreateTime())
                    .updateTime(company.getUpdateTime())
                    .companyName(company.getCompanyName())
                    .isDeleted(company.getIsDeleted())
                    .build();
        }
    }
}
