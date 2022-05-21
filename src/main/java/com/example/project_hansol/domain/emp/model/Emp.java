package com.example.project_hansol.domain.emp.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Emp extends BaseModel {

    private Long empId;
    private String ename;
    private String detail;
    private String phoneNumber;

    private Long workId;
    private Long jobId;

    @Builder
    public Emp(String ename, String detail, String phoneNumber,Long workId, Long jobId){
        this.ename = ename;
        this.detail = detail;
        this.phoneNumber = phoneNumber;
        this.workId = workId;
        this.jobId = jobId;
    }


    public void setEmpId(Long empId) {
        this.empId = empId;
    }
}
