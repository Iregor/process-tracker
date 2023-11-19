package com.iregor.service.impl;

import com.iregor.dto.transition.TransitionIncomeDto;
import com.iregor.dto.transition.TransitionOutcomeDto;
import com.iregor.repository.TransitionRepository;
import com.iregor.service.TransitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransitionServiceImpl implements TransitionService {
    private final TransitionRepository transitionRepository;

    @Override
    public TransitionOutcomeDto createTransition(TransitionIncomeDto transitionIncomeDto, Long architectId) {
        return null;
    }

    @Override
    public TransitionOutcomeDto findTransitionById(Long id) {
        return null;
    }

    @Override
    public List<TransitionOutcomeDto> findProcessTemplateTransitions(Long processTemplateId) {
        return null;
    }

    @Override
    public void deleteTransition(Long id) {

    }

    @Override
    public TransitionOutcomeDto patchTransition(TransitionIncomeDto transitionIncomeDto, Long id) {
        return null;
    }
}
