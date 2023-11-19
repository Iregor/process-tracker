package com.iregor.repository;

import com.iregor.entity.StateTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateTemplateRepository extends JpaRepository<StateTemplate, Long> {
}
