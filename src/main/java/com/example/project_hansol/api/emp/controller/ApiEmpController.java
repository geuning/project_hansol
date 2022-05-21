package com.example.project_hansol.api.emp.controller;


import com.example.project_hansol.api.emp.dto.EmpRegisterRequestDto;
import com.example.project_hansol.api.emp.dto.EmpSearchResponseDto;
import com.example.project_hansol.api.emp.dto.EmpUpdateRequestDto;
import com.example.project_hansol.api.emp.service.ApiEmpService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="empController", description = "회원 API")
@RequestMapping("/api/emps")
@RequiredArgsConstructor
public class ApiEmpController {

    private final ApiEmpService apiEmpService;

    @Operation(summary = "회원 조회", description = "전체 회원을 조회합니다.")
    @GetMapping
    public ResponseEntity<List<EmpSearchResponseDto>> findAllemps(
            @RequestParam(value = "name", required = false, defaultValue = "") String ename){
        List<EmpSearchResponseDto> empDtos = apiEmpService.findAllEmpsWithEname(ename);
        return ResponseEntity.ok(empDtos);
    }

    @Operation(summary = "회원 정보 등록", description = "회원 정보를 등록합니다.")
    @PostMapping
    public String registerEmp(@RequestBody EmpRegisterRequestDto requestDto){
        apiEmpService.registerEmp(requestDto);
        return "registration success";
    }

    @Operation(summary = "회원 정보 수정", description = "회원 정보를 수정합니다.")
    @PatchMapping("/{empId}")
    public String updateEmp(@PathVariable Long empId, @RequestBody EmpUpdateRequestDto requestDto){
        apiEmpService.updateEmp(empId, requestDto);
        return "update success";
    }

    @Operation(summary = "회원 정보 삭제", description = "회원 정보를 삭제합니다.")
    @DeleteMapping("/{empId}")
    public String deleteJob(@PathVariable Long empId){
        apiEmpService.deleteEmp(empId);
        return "delete success";
    }
}
