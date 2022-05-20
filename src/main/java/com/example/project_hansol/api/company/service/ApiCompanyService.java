package com.example.project_hansol.api.company.service;

import com.example.project_hansol.api.company.dto.CompanyRegisterRequestDto;
import com.example.project_hansol.api.company.dto.CompanySearchResponseDto;
import com.example.project_hansol.domain.company.model.Company;
import com.example.project_hansol.domain.company.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ApiCompanyService {

    private final CompanyService companyService;

    public List<CompanySearchResponseDto> findAllCompaniesWithCompanyName(String companyName) {
        List<Company> allCompanies = companyService.findAllCompaniesWithCompanyName(companyName);
        return allCompanies.stream().map(company -> CompanySearchResponseDto.of(company))
                .collect(Collectors.toList());
    }

    public void registerCompany(CompanyRegisterRequestDto request){
        Company company = request.toEntity();
        companyService.registerCompany(company);
    }



}
