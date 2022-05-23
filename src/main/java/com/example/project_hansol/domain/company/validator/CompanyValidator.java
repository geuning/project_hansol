package com.example.project_hansol.domain.company.validator;

import com.example.project_hansol.domain.company.model.Company;
import com.example.project_hansol.domain.company.repository.CompanyMapper;
import com.example.project_hansol.global.error.exception.BusinessException;
import com.example.project_hansol.global.error.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CompanyValidator {

    private final CompanyMapper companyMapper;

    public void validateDuplicateCompany(String companyName){
        Optional<Company> optionalComapny = companyMapper.findByCompanyName(companyName);
        if(optionalComapny.isPresent()){
            throw new BusinessException(ErrorCode.ALREADY_REGISTERD_COMPANY);
        }
    }
}
