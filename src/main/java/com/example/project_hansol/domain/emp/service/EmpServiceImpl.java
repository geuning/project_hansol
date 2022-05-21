package com.example.project_hansol.domain.emp.service;


import com.example.project_hansol.domain.emp.model.Emp;
import com.example.project_hansol.domain.emp.repository.EmpMapper;
import com.example.project_hansol.domain.job.model.Job;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmpServiceImpl implements EmpService{

    private final EmpMapper empMapper;

    @Override
    public List<Emp> findAllEmpsWithEname(String ename){
        return empMapper.findAllEmpsWithEname(ename);
    }

    @Override
    public void registerEmp(Emp emp){
        empMapper.registerEmp(emp);
    }

    @Override
    public Emp findByEmpId(Long empId){
        return empMapper.findByEmpId(empId);
    }

    @Override
    public void updateEmp(Emp emp){
        empMapper.updateEmp(emp);
    }

    @Override
    public void deleteEmp(Emp emp){
        empMapper.deleteEmp(emp);
    }

}
