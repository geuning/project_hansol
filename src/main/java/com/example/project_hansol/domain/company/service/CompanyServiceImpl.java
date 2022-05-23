package com.example.project_hansol.domain.company.service;

import com.example.project_hansol.domain.company.model.Company;
import com.example.project_hansol.domain.company.repository.CompanyMapper;
import com.example.project_hansol.domain.company.validator.CompanyValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CompanyServiceImpl implements CompanyService {

    private final CompanyMapper companyMapper;
    private final CompanyValidator companyValidator;

    @Override
    public List<Company> findAllCompaniesWithCompanyName(String companyName){
        return companyMapper.findAllCompaniesWithCompanyName(companyName);
    }

    @Override
    public void registerCompany(Company company){
        validateRegisterCompany(company);
        Company checkCompany = companyMapper.findByCompanyNameWithIsDeleted(company.getCompanyName());
        if(checkCompany != null && checkCompany.getIsDeleted()){
            checkCompany.updateIsDeleted(false);
            companyMapper.isTrueCompany(checkCompany);
        } else {
            companyMapper.registerCompany(company);
        }
    }

    @Override
    public Optional<Company> findByCompanyId(Long companyId){
        return companyMapper.findByCompanyId(companyId);
    }

    @Override
    public void updateCompany(Company company){
        companyMapper.updateCompany(company);
    }

    @Override
    public void deleteCompany(Company company){
        companyMapper.deleteCompany(company);
    }

    public void validateRegisterCompany(Company company){
        companyValidator.validateDuplicateCompany(company.getCompanyName());
    }
}
