package com.example.project_hansol.domain.emp.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Emp extends BaseModel {

    private Long empId;
    private String ename;
    private String detail;
    private String phoneNumber;

    private Long workId;
    private Long jobId;

}
