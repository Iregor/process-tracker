package com.iregor.service.impl;

import com.iregor.dto.state.StateIncomeDto;
import com.iregor.dto.state.StateOutcomeDto;
import com.iregor.service.StateService;

import java.util.List;
import java.util.Map;

public class StateServiceImpl implements StateService {
    @Override
    public StateOutcomeDto createState(StateIncomeDto embeddedStateIncomeDto, Long templateId, Long stateId) {
        return null;
    }

    @Override
    public StateOutcomeDto findStateById(Long id) {
        return null;
    }

    @Override
    public List<StateOutcomeDto> findAllTemplateStates(Long templateId, int page, int size) {
        return null;
    }

    @Override
    public List<StateOutcomeDto> findPossibleProcessStates(Long processId) {
        return null;
    }

    @Override
    public List<StateOutcomeDto> findStatesByParams(Map<String, String> requestParams) {
        return null;
    }

    @Override
    public void deleteStateById(Long id) {

    }

    @Override
    public StateOutcomeDto patchState(StateIncomeDto embeddedStateIncomeDto, Long id) {
        return null;
    }
}
