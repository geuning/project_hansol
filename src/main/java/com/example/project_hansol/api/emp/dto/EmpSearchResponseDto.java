package com.example.project_hansol.api.emp.dto;

import com.example.project_hansol.domain.emp.model.Emp;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmpSearchResponseDto {

    private Long empId;
    private String ename;
    private String detail;
    private String phoneNumber;

    private Long workId;
    private Long jobId;

    public static EmpSearchResponseDto of(Emp emp){

        return builder()
                .empId(emp.getEmpId())
                .ename(emp.getEname())
                .detail(emp.getDetail())
                .phoneNumber(emp.getPhoneNumber())
                .workId(emp.getWorkId())
                .jobId(emp.getJobId())
                .build();
    }
}
