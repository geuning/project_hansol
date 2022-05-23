package com.example.project_hansol.domain.company.repository;

import com.example.project_hansol.domain.company.model.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CompanyMapper {

    List<Company> findAllCompaniesWithCompanyName(String companyName);

    void registerCompany(Company company);

    Optional<Company> findByCompanyId(Long companyId);

    void updateCompany(Company company);

    void deleteCompany(Company company);
}
