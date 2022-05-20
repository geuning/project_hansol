package com.example.project_hansol.global.error.exception;

public class ModelNotFoundException extends BusinessException {

    public ModelNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }

}
