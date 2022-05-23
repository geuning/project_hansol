package com.example.project_hansol.api.company.service;

import com.example.project_hansol.api.company.dto.CompanyRegisterRequestDto;
import com.example.project_hansol.api.company.dto.CompanySearchResponseDto;
import com.example.project_hansol.api.company.dto.CompanyUpdateRequestDto;
import com.example.project_hansol.domain.company.model.Company;
import com.example.project_hansol.domain.company.service.CompanyService;
import com.example.project_hansol.global.error.exception.ErrorCode;
import com.example.project_hansol.global.error.exception.ModelNotFoundException;
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

    public void registerCompany(CompanyRegisterRequestDto requestDto){
        Company company = requestDto.toEntity();
        companyService.registerCompany(company);
    }

    public void updateCompany(Long companyId, CompanyUpdateRequestDto requestDto){
        Company company = companyService.findByCompanyId(companyId)
                .orElseThrow(() -> new ModelNotFoundException(ErrorCode.COMPANY_NOT_EXIST));
        Company changeCompany = requestDto.toEntity();
        changeCompany.setCompanyId(company.getCompanyId());
        companyService.updateCompany(changeCompany);
    }


    public void deleteCompany(Long companyId) {
        Company company = companyService.findByCompanyId(companyId)
                .orElseThrow(() -> new ModelNotFoundException(ErrorCode.COMPANY_NOT_EXIST));
        companyService.deleteCompany(company);
    }
}
