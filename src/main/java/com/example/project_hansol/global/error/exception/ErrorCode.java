package com.example.project_hansol.global.error.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

//    COMPANY_NAME_NOT_EXIST(404, "회사정보가 존재하지 않습니다.")
    ;

    ErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private int status;
    private String message;

}
