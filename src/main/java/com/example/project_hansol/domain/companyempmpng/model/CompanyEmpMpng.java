package com.example.project_hansol.domain.companyempmpng.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CompanyEmpMpng extends BaseModel {

    private Long companyEmpId;

    private Long empId;
    private Long companyId;


}
