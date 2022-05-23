package com.example.project_hansol.domain.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public abstract class BaseModel {

    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Boolean isDeleted;

    public void updateIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

}
