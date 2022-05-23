package com.example.project_hansol.domain.work.service;

import com.example.project_hansol.domain.work.model.Work;

import java.util.List;
import java.util.Optional;

public interface WorkService {

    List<Work> findAllWorksWithWorkCode(String workCode);

    void registerWork(Work work);

    Optional<Work> findByWorkId(Long workId);

    void updateWork(Work work);

    void deleteWork(Work work);

    Optional<Work> findByWorkCode(String workCode);
}
