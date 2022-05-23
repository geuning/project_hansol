package com.example.project_hansol.domain.company.validator;

import com.example.project_hansol.domain.company.repository.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CompanyValidator {

    private final CompanyMapper companyMapper;

    public void validateDuplicateCompany(String companyName){

    }
}
