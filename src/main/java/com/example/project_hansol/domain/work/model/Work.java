package com.example.project_hansol.domain.work.model;

import com.example.project_hansol.domain.base.BaseModel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Work extends BaseModel {

    private Long workId;
    private String workCode;
    private String workTitle;

}
