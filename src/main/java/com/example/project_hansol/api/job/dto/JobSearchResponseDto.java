package com.example.project_hansol.api.job.dto;

import com.example.project_hansol.domain.job.model.Job;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class JobSearchResponseDto {

    @Schema(description = "직급 아이디", example = "99999")
    private Long jobId;

    @Schema(description = "직급명", example = "CEO")
    private String jobPosition;

    public static JobSearchResponseDto of(Job job){
        return builder()
                .jobId(job.getJobId())
                .jobPosition(job.getJobPosition())
                .build();
    }




}
