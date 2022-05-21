package com.example.project_hansol.domain.work.service;

import com.example.project_hansol.domain.work.model.Work;

import java.util.List;

public interface WorkService {

    List<Work> findAllWorksWithWorkCode(String workCode);

    void registerWork(Work work);

    Work findByWorkId(Long workId);

    void updateWork(Work work);

    void deleteWork(Work work);

    Work findByWorkCode(String workCode);
}
