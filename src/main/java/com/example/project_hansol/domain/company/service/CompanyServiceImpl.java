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
    public List<Company> findAllCompanies() {
        return companyMapper.findAllCompanies();
    }
}
