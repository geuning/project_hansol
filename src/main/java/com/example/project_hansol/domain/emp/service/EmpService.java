package com.example.project_hansol.domain.emp.service;


import com.example.project_hansol.domain.emp.model.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> findAllEmpsWithEname(String ename);

    void registerEmp(Emp emp);

    Emp findByEmpId(Long empId);

    void updateEmp(Emp emp);

    void deleteEmp(Emp emp);

}
