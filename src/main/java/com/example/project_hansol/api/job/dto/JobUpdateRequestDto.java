package com.example.project_hansol.api.job.dto;


import com.example.project_hansol.domain.job.model.Job;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobUpdateRequestDto {

    @Schema(description = "직급명", example = "CEO")
    private String jobPosition;

    public Job toEntity(){
        return Job.builder()
                .jobPosition(jobPosition)
                .build();
    }
}
