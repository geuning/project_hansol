package com.example.project_hansol.domain.companyempmpng.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class CompanyEmpMpng {

    private Long companyEmpId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Boolean isDeleted;

    private Long empId;
    private Long companyId;


}
