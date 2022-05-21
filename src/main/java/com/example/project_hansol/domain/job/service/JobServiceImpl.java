package com.example.project_hansol.domain.job.service;


import com.example.project_hansol.domain.job.model.Job;
import com.example.project_hansol.domain.job.repository.JobMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class JobServiceImpl implements JobService{

    private final JobMapper jobMapper;

    @Override
    public List<Job> findAllJobsWithJobPosition(String jobPosition){
        return jobMapper.findAllJobsWithJobPosition(jobPosition);
    }

    @Override
    public void registerJob(Job job){
        jobMapper.registerJob(job);
    }

    @Override
    public Job findByJobId(Long jobId){
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

}
