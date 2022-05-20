package com.example.project_hansol.domain.company.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Company {

    private Long companyId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String companyName;
    private Boolean isDeleted;

}
