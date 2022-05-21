package com.example.project_hansol.api.job.controller;

import com.example.project_hansol.api.job.dto.JobRegisterRequestDto;
import com.example.project_hansol.api.job.dto.JobSearchResponseDto;
import com.example.project_hansol.api.job.dto.JobUpdateRequestDto;
import com.example.project_hansol.api.job.service.ApiJobService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="jobController", description = "직급 API")
@RequestMapping("/api/jobs")
@RequiredArgsConstructor
public class ApiJobController {

    private final ApiJobService apiJobService;

    @Operation(summary = "직급 조회", description = "전체 직급를 조회합니다.")
    @GetMapping
    public ResponseEntity<List<JobSearchResponseDto>> findAllJobs(
            @RequestParam(value = "position", required = false, defaultValue = "") String jobPosition){
        List<JobSearchResponseDto> jobDtos = apiJobService.findAllJobsWithJobPosition(jobPosition);
        return ResponseEntity.ok(jobDtos);
    }

    @Operation(summary = "직급 정보 등록", description = "직급 정보를 등록합니다.")
    @PostMapping
    public String registerJob(@RequestBody JobRegisterRequestDto requestDto){
        apiJobService.registerJob(requestDto);
        return "registration success";
    }

    @Operation(summary = "직급 정보 수정", description = "직급 정보를 수정합니다.")
    @PatchMapping("/{jobId}")
    public String updateJob(@PathVariable Long jobId, @RequestBody JobUpdateRequestDto requestDto){
        apiJobService.updateJob(jobId, requestDto);
        return "update success";
    }

    @Operation(summary = "직급 정보 삭제", description = "직급 정보를 삭제합니다.")
    @DeleteMapping("/{jobId}")
    public String deleteJob(@PathVariable Long jobId){
        apiJobService.deleteJob(jobId);
        return "delete success";
    }
}
