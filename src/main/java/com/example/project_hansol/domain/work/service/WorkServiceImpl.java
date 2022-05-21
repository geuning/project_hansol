package com.example.project_hansol.domain.work.service;


import com.example.project_hansol.domain.job.model.Job;
import com.example.project_hansol.domain.work.model.Work;
import com.example.project_hansol.domain.work.repository.WorkMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class WorkServiceImpl implements WorkService {

    private final WorkMapper workMapper;

    @Override
    public List<Work> findAllWorksWithWorkCode(String workCode){
        return workMapper.findAllWorksWithWorkCode(workCode);
    }

    @Override
    public void registerWork(Work work){
        workMapper.registerWork(work);
    }

    @Override
    public Work findByWorkId(Long workId){
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


}
