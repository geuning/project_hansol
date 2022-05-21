package com.example.project_hansol.api.work.dto;

import com.example.project_hansol.domain.work.model.Work;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WorkSearchResponseDto {

    @Schema(description = "업무 아이디", example = "99999")
    private Long workId;

    @Schema(description = "업무 코드", example = "W-99999")
    private String workCode;

    @Schema(description = "업무명", example = "총무")
    private String workTitle;

    public static WorkSearchResponseDto of(Work work){
        return builder()
                .workId(work.getWorkId())
                .workCode(work.getWorkCode())
                .workTitle(work.getWorkTitle())
                .build();
    }


}
