package com.example.project_hansol.domain.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public abstract class BaseModel {

    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String createdBy;
    private String modifiedBy;
    private Boolean isDeleted;

}
