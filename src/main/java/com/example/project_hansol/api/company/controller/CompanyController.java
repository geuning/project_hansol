package com.example.project_hansol.api.company.controller;

import com.example.project_hansol.api.company.dto.CompanyDto;
import com.example.project_hansol.domain.company.model.Company;
import com.example.project_hansol.domain.company.service.CompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Tag(name="CompanyController", description = "회사 API")
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @Operation(summary = "전체 회사 조회", description = "전체 회사를 조회합니다.")
    @GetMapping
    public ResponseEntity<List<CompanyDto.Response>> findAllCompanies() {
        List<Company> allCompanies = companyService.findAllCompanies();
        List<CompanyDto.Response> companyDtos = allCompanies.stream().map(company -> CompanyDto.Response.of(company))
                .collect(Collectors.toList());
        return ResponseEntity.ok(companyDtos);
    }

//    @Operation(summary = "회사 이름 조회", description = "이름으로 회사를 조회합니다.")
//    @GetMapping
//    public ResponseEntity<List<CompanyDto.Response>> findCompanyName(
//            @RequestParam(value = "name", required = false, defaultValue = "") String companyName) {
//
//    }



}
