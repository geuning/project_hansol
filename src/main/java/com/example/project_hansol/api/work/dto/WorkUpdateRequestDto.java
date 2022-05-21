package com.example.project_hansol.api.work.dto;


import com.example.project_hansol.domain.work.model.Work;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkUpdateRequestDto {

    @Schema(description = "업무코드", example = "W-99999")
    private String workCode;

    @Schema(description = "업무명", example = "총무")
    private String workTitle;

    public Work toEntity(){
        return Work.builder()
                .workCode(workCode)
                .workTitle(workTitle)
                .build();
    }
}
