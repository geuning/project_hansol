package com.example.project_hansol.domain.work.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Work extends BaseModel {

    private Long workId;
    private String workCode;
    private String workTitle;

    @Builder
    public Work(String workCode, String workTitle){
        this.workCode = workCode;
        this.workTitle = workTitle;
    }

    public static Work createWork(Work work){
        return Work.builder()
                .workCode(work.getWorkCode())
                .workTitle(work.getWorkTitle())
                .build();
    }

    public void setWorkId(Long workId){
        this.workId = workId;
    }

}
