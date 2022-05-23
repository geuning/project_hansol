package com.example.project_hansol.global.error.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    COMPANY_NOT_EXIST(404, "회사 정보가 존재하지 않습니다."),
    WORK_NOT_EXIST(404, "업무 정보가 존재하지 않습니다."),
    JOB_NOT_EXIST(404, "직급 정보가 존재하지 않습니다."),
    EMP_NOT_EXIST(404, "사원 정보가 존재하지 않습니다,"),

    ALREADY_REGISTERD_JOB(400, "이미 등록된 직급 입니다."),
    ALREADY_REGISTERD_WORK(400, "이미 등록된 업무 입니다."),
    ALREADY_REGISTERD_COMPANY(400, "이미 등록된 회사 입니다.")
    ;

    ErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private int status;
    private String message;

}
