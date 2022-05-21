package com.example.project_hansol.api.emp.dto;


import com.example.project_hansol.domain.emp.model.Emp;
import com.example.project_hansol.domain.job.model.Job;
import com.example.project_hansol.domain.work.model.Work;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpRegisterRequestDto {

    @Schema(description = "사원명", example = "홍길동")
    private String ename;

    @Schema(description = "업무종류", example = "채용")
    private String detail;

    @Schema(description = "전화번호", example = "08-9999-9999")
    private String phoneNumber;

    private String  workCode;

    private String jobPosition;

    public Emp toEntity(Work work, Job job){
        return Emp.builder()
                .ename(ename)
                .detail(detail)
                .phoneNumber(phoneNumber)
                .workId(work.getWorkId())
                .jobId(job.getJobId())
                .build();
    }
}
