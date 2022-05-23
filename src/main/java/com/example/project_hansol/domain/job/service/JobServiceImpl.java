package com.example.project_hansol.domain.job.service;


import com.example.project_hansol.domain.job.model.Job;
import com.example.project_hansol.domain.job.repository.JobMapper;
import com.example.project_hansol.domain.job.validator.JobValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class JobServiceImpl implements JobService{

    private final JobMapper jobMapper;
    private final JobValidator jobValidator;

    @Override
    public List<Job> findAllJobsWithJobPosition(String jobPosition){
        return jobMapper.findAllJobsWithJobPosition(jobPosition);
    }

    @Override
    public void registerJob(Job job){
        validateRegisterJob(job);
        jobMapper.registerJob(job);
    }

    @Override
    public Optional<Job> findByJobId(Long jobId){
        return jobMapper.findByJobId(jobId);
    }

    @Override
    public void updateJob(Job job){
        jobMapper.updateJob(job);
    }

    @Override
    public void deleteJob(Job job){
        jobMapper.deleteJob(job);
    }

    @Override
    public Optional<Job> findByJobPosition(String jobPosition){
        return jobMapper.findByJobPosition(jobPosition);
    }

    public void validateRegisterJob(Job job){
        jobValidator.validateDuplicateJob(job.getJobPosition());

    }

}
