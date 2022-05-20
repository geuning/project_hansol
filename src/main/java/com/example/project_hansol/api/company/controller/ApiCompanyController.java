package com.example.project_hansol.api.company.controller;

import com.example.project_hansol.api.company.dto.CompanyRegisterRequestDto;
import com.example.project_hansol.api.company.dto.CompanySearchResponseDto;
import com.example.project_hansol.api.company.service.ApiCompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="CompanyController", description = "회사 API")
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class ApiCompanyController {

    private final ApiCompanyService apiCompanyService;

    @Operation(summary = "회사 조회", description = "전체 회사를 조회합니다.")
    @GetMapping
    public ResponseEntity<List<CompanySearchResponseDto>> findAllCompanies(
            @RequestParam(value = "name", required = false, defaultValue = "") String companyName) {
        List<CompanySearchResponseDto> companyDtos = apiCompanyService.findAllCompaniesWithCompanyName(companyName);
        return ResponseEntity.ok(companyDtos);
    }

    @Operation(summary = "회사 정보 등록", description = "회사 정보를 등록합니다.")
    @PostMapping
    public String registerCompany(@RequestBody CompanyRegisterRequestDto request){
        apiCompanyService.registerCompany(request);
        return "success";
    }


}
