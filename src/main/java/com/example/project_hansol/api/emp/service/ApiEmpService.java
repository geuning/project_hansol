package com.example.project_hansol.api.emp.service;

import com.example.project_hansol.api.emp.dto.EmpRegisterRequestDto;
import com.example.project_hansol.api.emp.dto.EmpSearchResponseDto;
import com.example.project_hansol.api.emp.dto.EmpUpdateRequestDto;
import com.example.project_hansol.domain.emp.model.Emp;
import com.example.project_hansol.domain.emp.service.EmpService;
import com.example.project_hansol.domain.job.model.Job;
import com.example.project_hansol.domain.job.service.JobService;
import com.example.project_hansol.domain.work.model.Work;
import com.example.project_hansol.domain.work.service.WorkService;
import com.example.project_hansol.global.error.exception.ErrorCode;
import com.example.project_hansol.global.error.exception.ModelNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ApiEmpService {

    private final EmpService empService;
    private final WorkService workService;
    private final JobService jobService;

    public List<EmpSearchResponseDto> findAllEmpsWithEname(String ename){
        List<Emp> allEmps = empService.findAllEmpsWithEname(ename);
        return allEmps.stream().map(emp -> EmpSearchResponseDto.of(emp))
                .collect(Collectors.toList());
    }

    public void registerEmp(EmpRegisterRequestDto requestDto){
        String workCode = requestDto.getWorkCode();
        String jobPosition = requestDto.getJobPosition();
        Work work = workService.findByWorkCode(workCode);
        Job job = jobService.findByJobPosition(jobPosition);
        Emp emp = requestDto.toEntity(work, job);
        empService.registerEmp(emp);
    }

    public void updateEmp(Long empId, EmpUpdateRequestDto requestDto){
        Emp emp = empService.findByEmpId(empId)
                .orElseThrow(() -> new ModelNotFoundException(ErrorCode.EMP_NOT_EXIST));
        Emp changeEmp = requestDto.toEntity();
        changeEmp.setEmpId(emp.getEmpId());
        empService.updateEmp(changeEmp);
    }

    public void deleteEmp(Long empId) {
        Emp emp = empService.findByEmpId(empId)
                .orElseThrow(() -> new ModelNotFoundException(ErrorCode.EMP_NOT_EXIST));
        empService.deleteEmp(emp);
    }

}
