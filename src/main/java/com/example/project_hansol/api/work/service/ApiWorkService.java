package com.example.project_hansol.api.work.service;


import com.example.project_hansol.api.work.dto.WorkRegisterRequestDto;
import com.example.project_hansol.api.work.dto.WorkSearchResponseDto;
import com.example.project_hansol.api.work.dto.WorkUpdateRequestDto;
import com.example.project_hansol.domain.work.model.Work;
import com.example.project_hansol.domain.work.service.WorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ApiWorkService {

    private final WorkService workService;

    public List<WorkSearchResponseDto> findAllWorksWithWorkCode(String workCode){
        List<Work> allWorks = workService.findAllWorksWithWorkCode(workCode);
        return allWorks.stream().map(work -> WorkSearchResponseDto.of(work))
                .collect(Collectors.toList());
    }

    public void registerWork(WorkRegisterRequestDto requestDto){
        Work work = requestDto.toEntity();
        workService.registerWork(work);
    }

    public void updateWork(Long workId, WorkUpdateRequestDto requestDto){
        Work work = workService.findByWorkId(workId);
        Work changeWork = requestDto.toEntity();
        changeWork.setWorkId(work.getWorkId());
        workService.updateWork(changeWork);
    }

    public void deleteWork(Long workId) {
        Work work = workService.findByWorkId(workId);
        workService.deleteWork(work);
    }
}
