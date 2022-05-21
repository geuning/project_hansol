package com.example.project_hansol.api.emp.dto;


import com.example.project_hansol.domain.emp.model.Emp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpUpdateRequestDto {

    private String ename;
    private String detail;
    private String phoneNumber;

    public Emp toEntity(){
        return Emp.builder()
                .ename(ename)
                .detail(detail)
                .phoneNumber(phoneNumber)
                .build();
    }
}
