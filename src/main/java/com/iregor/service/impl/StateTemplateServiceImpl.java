package com.iregor.service.impl;

import com.iregor.dto.state_template.StateTemplateIncomeDto;
import com.iregor.dto.state_template.StateTemplateOutcomeDto;
import com.iregor.repository.StateRepository;
import com.iregor.repository.StateTemplateRepository;
import com.iregor.service.StateTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StateTemplateServiceImpl implements StateTemplateService {
    private final StateTemplateRepository stateTemplateRepository;
    private final StateRepository stateRepository;

    @Override
    public StateTemplateOutcomeDto createState(StateTemplateIncomeDto stateIncomeDto, Long architectId) {
        return null;
    }

    @Override
    public StateTemplateOutcomeDto findStateById(Long id) {
        return null;
    }

    @Override
    public List<StateTemplateOutcomeDto> findAllStatesByCategoryId(Long categoryId, int page, int size) {
        return null;
    }

    @Override
    public List<StateTemplateOutcomeDto> findStateTemplatesByParams(Map<String, String> requestParams) {
        return null;
    }

    @Override
    public void deleteState(Long id) {

    }

    @Override
    public StateTemplateOutcomeDto patchState(StateTemplateIncomeDto stateIncomeDto, Long id) {
        return null;
    }
}