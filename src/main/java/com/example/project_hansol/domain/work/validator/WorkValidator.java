package com.example.project_hansol.domain.work.validator;

import com.example.project_hansol.domain.work.model.Work;
import com.example.project_hansol.domain.work.repository.WorkMapper;
import com.example.project_hansol.global.error.exception.BusinessException;
import com.example.project_hansol.global.error.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class WorkValidator {

    private final WorkMapper workMapper;

    public void validateDuplicateWork(String workCode){
        Optional<Work> optionalWork = workMapper.findByWorkCode(workCode);
        if(optionalWork.isPresent()){
            throw new BusinessException(ErrorCode.ALREADY_REGISTERD_WORK);
        }
    }
}
