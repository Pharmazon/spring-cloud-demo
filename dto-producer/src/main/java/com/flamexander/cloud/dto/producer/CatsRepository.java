package com.flamexander.cloud.dto.producer;

import com.flamexander.cloud.dto.common.CatDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatsRepository extends JpaRepository<Cat, Long> {
    List<CatDTO> findAllBy();
}
