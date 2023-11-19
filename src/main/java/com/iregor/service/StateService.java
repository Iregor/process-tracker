package com.iregor.service;

import com.iregor.dto.state.StateIncomeDto;
import com.iregor.dto.state.StateOutcomeDto;

import java.util.List;
import java.util.Map;

public interface StateService {
    StateOutcomeDto createState(StateIncomeDto stateIncomeDto, Long processTemplateId, Long stateTemplateId);

    StateOutcomeDto findStateById(Long id);

    List<StateOutcomeDto> findAllTemplateStates(Long processTemplateId, int page, int size);

    List<StateOutcomeDto> findPossibleProcessStates(Long processId);

    List<StateOutcomeDto> findStatesByParams(Map<String, String> requestParams);

    void deleteStateById(Long id);

    StateOutcomeDto patchState(StateIncomeDto stateIncomeDto, Long id);
}
