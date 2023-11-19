package com.iregor.service.impl;

import com.iregor.dto.process_template.ProcessTemplateIncomeDto;
import com.iregor.dto.process_template.ProcessTemplateOutcomeDto;
import com.iregor.repository.ProcessTemplateRepository;
import com.iregor.service.ProcessTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcessTemplateServiceImpl implements ProcessTemplateService {
    private final ProcessTemplateRepository templateRepository;

    @Override
    public ProcessTemplateOutcomeDto createTemplate(ProcessTemplateIncomeDto templateIncomeDto, Long architectId) {
        return null;
    }

    @Override
    public ProcessTemplateOutcomeDto findTemplateById(Long id) {
        return null;
    }

    @Override
    public void deleteTemplate(Long id) {

    }

    @Override
    public ProcessTemplateOutcomeDto patchTemplate(ProcessTemplateIncomeDto templateIncomeDto, Long id) {
        return null;
    }
}
