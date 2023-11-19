package com.iregor.service;

import com.iregor.dto.process.ProcessIncomeDto;
import com.iregor.dto.process.ProcessOutcomeDto;
import com.iregor.dto.process.ProcessParams;
import com.iregor.dto.state_template.StateTemplateOutcomeDto;

import java.util.List;

public interface ProcessService {
    ProcessOutcomeDto createProcess(ProcessIncomeDto processIncomeDto, Long ownerId);

    ProcessOutcomeDto findProcessById(Long id);

    List<ProcessOutcomeDto> findProcessesByParams(ProcessParams params);

    void deleteProcess(Long id);

    ProcessOutcomeDto patchProcess(ProcessIncomeDto processIncomeDto, Long id);

    List<StateTemplateOutcomeDto> findPossibleStates(Long id);
}
