package com.example.project_hansol.api.work.controller;


import com.example.project_hansol.api.work.dto.WorkRegisterRequestDto;
import com.example.project_hansol.api.work.dto.WorkSearchResponseDto;
import com.example.project_hansol.api.work.dto.WorkUpdateRequestDto;
import com.example.project_hansol.api.work.service.ApiWorkService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="workController", description = "업무 API")
@RequestMapping("/api/works")
@RequiredArgsConstructor
public class ApiWorkController {

    private final ApiWorkService apiWorkService;

    @Operation(summary = "업무 조회", description = "전체 업무를 조회합니다.")
    @GetMapping
    public ResponseEntity<List<WorkSearchResponseDto>> findAllWorks(
            @RequestParam(value = "code", required = false, defaultValue = "") String workCode){
        List<WorkSearchResponseDto> workDtos = apiWorkService.findAllWorksWithWorkCode(workCode);
        return ResponseEntity.ok(workDtos);
    }

    @Operation(summary = "업무 정보 등록", description = "업무 정보를 등록합니다.")
    @PostMapping
    public String registerWork(@RequestBody WorkRegisterRequestDto requestDto){
        apiWorkService.registerWork(requestDto);
        return "registration success";
    }

    @Operation(summary = "업무 정보 수정", description = "업무 정보를 수정합니다.")
    @PatchMapping("/{workId}")
    public String updateWork(@PathVariable Long workId, @RequestBody WorkUpdateRequestDto requestDto){
        apiWorkService.updateWork(workId, requestDto);
        return "update success";
    }

    @Operation(summary = "업무 정보 삭제", description = "업무 정보를 삭제합니다.")
    @DeleteMapping("/{workId}")
    public String deleteWork(@PathVariable Long workId){
        apiWorkService.deleteWork(workId);
        return "delete success";
    }


}
