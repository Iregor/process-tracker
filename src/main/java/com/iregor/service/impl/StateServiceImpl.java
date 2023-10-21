package com.iregor.service.impl;

import com.iregor.repository.StateInTemplateRepository;
import com.iregor.repository.StateRepository;
import com.iregor.service.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StateServiceImpl implements StateService {
    private final StateRepository stateRepository;
    private final StateInTemplateRepository stateInTemplateRepository;

}