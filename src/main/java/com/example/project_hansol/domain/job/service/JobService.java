package com.example.project_hansol.domain.job.service;

import com.example.project_hansol.domain.job.model.Job;

import java.util.List;

public interface JobService {

    List<Job> findAllJobsWithJobPosition(String jobPosition);

    void registerJob(Job job);

    Job findByJobId(Long jobId);

    void updateJob(Job job);

    void deleteJob(Job job);


}
