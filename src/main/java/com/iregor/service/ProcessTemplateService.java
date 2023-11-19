package com.iregor.service;

import com.iregor.dto.process_template.ProcessTemplateIncomeDto;
import com.iregor.dto.process_template.ProcessTemplateOutcomeDto;

public interface ProcessTemplateService {
    ProcessTemplateOutcomeDto createTemplate(ProcessTemplateIncomeDto templateIncomeDto, Long architectId);

    ProcessTemplateOutcomeDto findTemplateById(Long id);

    void deleteTemplate(Long id);

    ProcessTemplateOutcomeDto patchTemplate(ProcessTemplateIncomeDto templateIncomeDto, Long id);
}
