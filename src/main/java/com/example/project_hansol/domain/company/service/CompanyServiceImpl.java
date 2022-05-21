package com.example.project_hansol.domain.company.service;

import com.example.project_hansol.domain.company.model.Company;
import com.example.project_hansol.domain.company.repository.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CompanyServiceImpl implements CompanyService {

    private final CompanyMapper companyMapper;

    @Override
    public List<Company> findAllCompaniesWithCompanyName(String companyName){
        return companyMapper.findAllCompaniesWithCompanyName(companyName);
    }

    @Override
    public void registerCompany(Company company){
        companyMapper.registerCompany(company);
    }

    @Override
    public Company findByCompanyId(Long companyId){
        return companyMapper.findByCompanyId(companyId);
    }

    @Override
    public void updateCompany(Company company){
        companyMapper.updateCompany(company);
    }
}
