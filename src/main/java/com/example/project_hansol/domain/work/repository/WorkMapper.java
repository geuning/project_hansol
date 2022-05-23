package com.example.project_hansol.domain.work.repository;

import com.example.project_hansol.domain.work.model.Work;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface WorkMapper {

    List<Work> findAllWorksWithWorkCode(String workCode);

    void registerWork(Work work);

    Optional<Work> findByWorkId(Long workId);

    void updateWork(Work work);

    void deleteWork(Work work);

    Optional<Work> findByWorkCode(String workCode);


}
