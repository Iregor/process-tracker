package com.iregor.controller;

import com.iregor.dto.state_template.StateTemplateIncomeDto;
import com.iregor.dto.state_template.StateTemplateOutcomeDto;
import com.iregor.service.StateTemplateService;
import com.iregor.validation.OnCreate;
import com.iregor.validation.OnUpdate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
public class StateTemplateController {
    private final StateTemplateService stateService;

    @PostMapping("/state-templates")
    public StateTemplateOutcomeDto createState(@RequestBody @Validated(OnCreate.class) StateTemplateIncomeDto stateIncomeDto,
                                               @RequestHeader("architect-id") @PositiveOrZero @NotNull Long architectId) {
        StateTemplateOutcomeDto stateOutcomeDto = stateService.createState(stateIncomeDto, architectId);
        //add logging
        return stateOutcomeDto;
    }

    @GetMapping("/state-templates/{id}")
    public StateTemplateOutcomeDto findStateById(@PathVariable @PositiveOrZero Long id) {
        StateTemplateOutcomeDto stateOutcomeDto = stateService.findStateById(id);
        //add logging
        return stateOutcomeDto;
    }

    @GetMapping("/categories/{categoryId}/state-templates")
    public List<StateTemplateOutcomeDto> findAllStateTemplatesByCategoryId(@PathVariable @NotNull @PositiveOrZero Long categoryId,
                                                                           @RequestParam(defaultValue = "0") @PositiveOrZero int page,
                                                                           @RequestParam(defaultValue = "10") @Positive int size) {
        List<StateTemplateOutcomeDto> states = stateService.findAllStatesByCategoryId(categoryId, page, size);
        //add logging
        return states;
    }

    @GetMapping("/state-templates")
    List<StateTemplateOutcomeDto> findStateTemplatesByParams(@RequestParam Map<String, String> requestParams) {
        List<StateTemplateOutcomeDto> stateTemplates = stateService.findStateTemplatesByParams(requestParams);
        //add logging
        return stateTemplates;
    }

    @DeleteMapping("/state-templates/{id}")
    public void deleteState(@PathVariable @PositiveOrZero Long id) {
        stateService.deleteState(id);
        //add logging
    }

    @PatchMapping("/state-templates/{id}")
    public StateTemplateOutcomeDto patchState(@RequestBody @Validated(OnUpdate.class) StateTemplateIncomeDto stateIncomeDto,
                                              @PathVariable @PositiveOrZero Long id) {
        StateTemplateOutcomeDto stateOutcomeDto = stateService.patchState(stateIncomeDto, id);
        //add logging
        return stateOutcomeDto;
    }
}