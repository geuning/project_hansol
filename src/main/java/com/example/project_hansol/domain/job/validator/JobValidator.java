package com.example.project_hansol.domain.job.validator;

import com.example.project_hansol.domain.job.model.Job;
import com.example.project_hansol.domain.job.repository.JobMapper;
import com.example.project_hansol.global.error.exception.BusinessException;
import com.example.project_hansol.global.error.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class JobValidator {

    private final JobMapper jobMapper;

    public void validateDuplicateJob(String jobPosition){
        Optional<Job> optionalJob = jobMapper.findByJobPosition(jobPosition);
        if(optionalJob.isPresent()){
            throw new BusinessException(ErrorCode.ALREADY_REGISTERD_JOB);
        }
    }
}
