package com.example.project_hansol.domain.job.service;

import com.example.project_hansol.domain.job.model.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {

    List<Job> findAllJobsWithJobPosition(String jobPosition);

    void registerJob(Job job);

    Optional<Job> findByJobId(Long jobId);

    void updateJob(Job job);

    void deleteJob(Job job);

    Optional<Job> findByJobPosition(String jobPosition);
}
