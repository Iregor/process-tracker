package com.iregor.service;

import com.iregor.dto.transition.TransitionIncomeDto;
import com.iregor.dto.transition.TransitionOutcomeDto;

import java.util.List;

public interface TransitionService {
    TransitionOutcomeDto createTransition(TransitionIncomeDto transitionIncomeDto, Long architectId);

    TransitionOutcomeDto findTransitionById(Long id);

    List<TransitionOutcomeDto> findProcessTemplateTransitions(Long processTemplateId);

    void deleteTransition(Long id);

    TransitionOutcomeDto patchTransition(TransitionIncomeDto transitionIncomeDto, Long id);
}
