package com.example.project_hansol.domain.emp.repository;

import com.example.project_hansol.domain.emp.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface EmpMapper {
    List<Emp> findAllEmpsWithEname(String ename);

    void registerEmp(Emp emp);

    Optional<Emp> findByEmpId(Long empId);

    void updateEmp(Emp emp);

    void deleteEmp(Emp emp);


}
