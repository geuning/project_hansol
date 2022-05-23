package com.example.project_hansol.domain.job.repository;

import com.example.project_hansol.domain.job.model.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface JobMapper {
    List<Job> findAllJobsWithJobPosition(String jobPosition);

    void registerJob(Job job);

    Optional<Job> findByJobId(Long jobId);

    void updateJob(Job job);

    void deleteJob(Job job);

    Optional<Job> findByJobPosition(String jobPosition);

    Job findByJobPositionWithIsDeleted(String jobPosition);

    void isTrueJob(Job job);

}
