package com.example.project_hansol.domain.job.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Job {

    private Long jobId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String jobPosition;
    private Boolean isDeleted;

}
