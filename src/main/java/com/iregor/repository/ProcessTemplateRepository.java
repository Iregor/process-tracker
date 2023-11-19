package com.iregor.repository;

import com.iregor.entity.ProcessTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessTemplateRepository extends JpaRepository<ProcessTemplate, Long> {
}
