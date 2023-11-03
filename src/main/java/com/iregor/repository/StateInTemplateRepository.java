package com.iregor.repository;

import com.iregor.entity.StateInTemplate;
import com.iregor.entity.supp.StateInTemplateId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateInTemplateRepository extends JpaRepository<StateInTemplate, StateInTemplateId> {
}
