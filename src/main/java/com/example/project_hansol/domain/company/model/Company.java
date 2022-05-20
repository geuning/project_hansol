package com.example.project_hansol.domain.company.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Company extends BaseModel {

    private Long companyId;
    private String companyName;

    @Builder
    public Company(String companyName){
        this.companyName = companyName;
    }

    public static Company createCompany(Company company){
        return Company.builder()
                .companyName(company.getCompanyName())
                .build();
    }


}
