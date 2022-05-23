package com.example.project_hansol.domain.work.service;


import com.example.project_hansol.domain.work.model.Work;
import com.example.project_hansol.domain.work.repository.WorkMapper;
import com.example.project_hansol.domain.work.validator.WorkValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class WorkServiceImpl implements WorkService {

    private final WorkMapper workMapper;
    private final WorkValidator workValidator;

    @Override
    public List<Work> findAllWorksWithWorkCode(String workCode){
        return workMapper.findAllWorksWithWorkCode(workCode);
    }

    @Override
    public void registerWork(Work work){
        validateRegisterWork(work);
        workMapper.registerWork(work);
    }

    @Override
    public Optional<Work> findByWorkId(Long workId){
        return workMapper.findByWorkId(workId);
    }

    @Override
    public void updateWork(Work work){
        workMapper.updateWork(work);
    }

    @Override
    public void deleteWork(Work work){
        workMapper.deleteWork(work);
    }

    @Override
    public Optional<Work> findByWorkCode(String workCode){
        return workMapper.findByWorkCode(workCode);
    }

    public void validateRegisterWork(Work work){
        workValidator.validateDuplicateWork(work.getWorkCode());
    }


}
