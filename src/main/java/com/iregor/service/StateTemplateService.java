package com.iregor.service;

import com.iregor.dto.state_template.StateTemplateIncomeDto;
import com.iregor.dto.state_template.StateTemplateOutcomeDto;

import java.util.List;
import java.util.Map;

public interface StateTemplateService {

    StateTemplateOutcomeDto createState(StateTemplateIncomeDto stateIncomeDto, Long architectId);

    StateTemplateOutcomeDto findStateById(Long id);

    List<StateTemplateOutcomeDto> findAllStatesByCategoryId(Long categoryId, int page, int size);

    List<StateTemplateOutcomeDto> findStateTemplatesByParams(Map<String, String> requestParams);

    void deleteState(Long id);

    StateTemplateOutcomeDto patchState(StateTemplateIncomeDto stateIncomeDto, Long id);
}
