package com.example.project_hansol.domain.work.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Work {

    private Long workId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String workCode;
    private String workTitle;
    private Boolean isDeleted;

}
