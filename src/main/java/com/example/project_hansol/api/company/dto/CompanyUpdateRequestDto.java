package com.example.project_hansol.api.company.dto;

import com.example.project_hansol.domain.company.model.Company;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyUpdateRequestDto {

    @Schema(description = "회사명", example = "한솔")
    private String companyName;

    public Company toEntity(){
        return Company.builder()
                .companyName(companyName)
                .build();
    }
}
