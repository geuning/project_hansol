package com.example.project_hansol.domain.job.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Job extends BaseModel {

    private Long jobId;
    private String jobPosition;

}
