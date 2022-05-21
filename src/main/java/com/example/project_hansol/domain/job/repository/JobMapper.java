package com.example.project_hansol.domain.job.repository;

import com.example.project_hansol.domain.job.model.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobMapper {
    List<Job> findAllJobsWithJobPosition(String jobPosition);

    void registerJob(Job job);

    Job findByJobId(Long jobId);

    void updateJob(Job job);

    void deleteJob(Job job);

    Job findByJobPosition(String jobPosition);

}
