package com.example.project_hansol.domain.company.service;

import com.example.project_hansol.domain.company.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAllCompaniesWithCompanyName(String companyName);

    void registerCompany(Company company);

}
