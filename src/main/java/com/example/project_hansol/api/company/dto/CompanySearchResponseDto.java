package com.example.project_hansol.api.company.dto;

import com.example.project_hansol.domain.company.model.Company;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CompanySearchResponseDto {

    @Schema(description = "회사 아이디", example = "99999")
    private Long companyId;

    @Schema(description = "회사명", example = "한솔")
    private String companyName;


    public static CompanySearchResponseDto of(Company company){
        return builder()
                .companyId(company.getCompanyId())
                .companyName(company.getCompanyName())
                .build();
    }

}
