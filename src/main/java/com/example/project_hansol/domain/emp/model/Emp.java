package com.example.project_hansol.domain.emp.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Emp {

    private Long empId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String ename;
    private String detail;
    private String phoneNumber;
    private Boolean isDeleted;

    private Long workId;
    private Long jobId;

}
