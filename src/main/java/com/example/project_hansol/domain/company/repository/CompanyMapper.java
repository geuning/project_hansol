package com.example.project_hansol.domain.company.repository;

import com.example.project_hansol.domain.company.model.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {

    List<Company> findAllCompaniesWithCompanyName(String companyName);

    void registerCompany(Company company);

    Company findByCompanyId(Long companyId);

    void updateCompany(Company company);
}
