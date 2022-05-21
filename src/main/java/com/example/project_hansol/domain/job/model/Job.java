package com.example.project_hansol.domain.job.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Job extends BaseModel {

    private Long jobId;
    private String jobPosition;

    @Builder
    public Job(String jobPosition){
        this.jobPosition = jobPosition;
    }

    public static Job createJob(Job job){
        return Job.builder()
                .jobPosition(job.getJobPosition())
                .build();
    }

    public void setJobId(Long jobId){
        this.jobId = jobId;
    }

}
