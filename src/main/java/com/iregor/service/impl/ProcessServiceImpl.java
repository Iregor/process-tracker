package com.iregor.service.impl;

import com.iregor.dto.process.ProcessIncomeDto;
import com.iregor.dto.process.ProcessOutcomeDto;
import com.iregor.dto.process.ProcessParams;
import com.iregor.dto.state_template.StateTemplateOutcomeDto;
import com.iregor.repository.ProcessRepository;
import com.iregor.service.ProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProcessServiceImpl implements ProcessService {
    private final ProcessRepository processRepository;

    @Override
    public ProcessOutcomeDto createProcess(ProcessIncomeDto processIncomeDto, Long ownerId) {
        return null;
    }

    @Override
    public ProcessOutcomeDto findProcessById(Long id) {
        return null;
    }

    @Override
    public List<ProcessOutcomeDto> findProcessesByParams(ProcessParams params) {
        return null;
    }

    @Override
    public void deleteProcess(Long id) {

    }

    @Override
    public ProcessOutcomeDto patchProcess(ProcessIncomeDto processIncomeDto, Long id) {
        return null;
    }

    @Override
    public List<StateTemplateOutcomeDto> findPossibleStates(Long id) {
        return null;
    }
}
