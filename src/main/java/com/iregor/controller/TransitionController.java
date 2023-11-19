package com.iregor.controller;

import com.iregor.dto.transition.TransitionIncomeDto;
import com.iregor.dto.transition.TransitionOutcomeDto;
import com.iregor.service.TransitionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TransitionController {

    private final TransitionService transitionService;

    @PostMapping("/transitions")
    public TransitionOutcomeDto createTransition(@RequestBody @Valid TransitionIncomeDto transitionIncomeDto,
                                                 @RequestHeader("architect-id") @PositiveOrZero @NotNull Long architectId) {
        TransitionOutcomeDto transitionOutcomeDto = transitionService.createTransition(transitionIncomeDto, architectId);
        //add logging
        return transitionOutcomeDto;
    }

    @GetMapping("/transitions/{id}")
    public TransitionOutcomeDto findTransitionById(@PathVariable @PositiveOrZero Long id) {
        TransitionOutcomeDto transitionOutcomeDto = transitionService.findTransitionById(id);
        //add logging
        return transitionOutcomeDto;
    }

    @GetMapping("/process-templates/{processTemplateId}/transitions")
    List<TransitionOutcomeDto> findProcessTemplateTransitions(@PathVariable @NotNull @PositiveOrZero Long processTemplateId) {
        List<TransitionOutcomeDto> transitions = transitionService.findProcessTemplateTransitions(processTemplateId);
        //add logging
        return transitions;
    }

    @DeleteMapping("/transitions/{id}")
    public void deleteTransition(@PathVariable @PositiveOrZero Long id) {
        transitionService.deleteTransition(id);
        //add logging
    }

    @PatchMapping("/transitions/{id}")
    public TransitionOutcomeDto patchTransition(@RequestBody @Valid TransitionIncomeDto transitionIncomeDto,
                                                @PathVariable @PositiveOrZero Long id) {
        TransitionOutcomeDto transitionOutcomeDto = transitionService.patchTransition(transitionIncomeDto, id);
        //add logging
        return transitionOutcomeDto;
    }
}