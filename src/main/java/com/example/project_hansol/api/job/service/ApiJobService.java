package com.example.project_hansol.api.job.service;

import com.example.project_hansol.api.job.dto.JobRegisterRequestDto;
import com.example.project_hansol.api.job.dto.JobSearchResponseDto;
import com.example.project_hansol.api.job.dto.JobUpdateRequestDto;
import com.example.project_hansol.domain.job.model.Job;
import com.example.project_hansol.domain.job.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ApiJobService {

    private final JobService jobService;

    public List<JobSearchResponseDto> findAllJobsWithJobPosition(String jobPosition){
        List<Job> allJobs = jobService.findAllJobsWithJobPosition(jobPosition);
        return allJobs.stream().map(job -> JobSearchResponseDto.of(job))
                .collect(Collectors.toList());
    }

    public void registerJob(JobRegisterRequestDto requestDto){
        Job job = requestDto.toEntity();
        jobService.registerJob(job);
    }

    public void updateJob(Long jobId, JobUpdateRequestDto requestDto){
        Job job = jobService.findByJobId(jobId);
        Job changeJob = requestDto.toEntity();
        changeJob.setJobId(job.getJobId());
        jobService.updateJob(changeJob);
    }

    public void deleteJob(Long jobId) {
        Job job = jobService.findByJobId(jobId);
        jobService.deleteJob(job);
    }


}
