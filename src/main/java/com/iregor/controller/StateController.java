package com.iregor.controller;


import com.iregor.dto.state.StateIncomeDto;
import com.iregor.dto.state.StateOutcomeDto;
import com.iregor.service.StateService;
import com.iregor.validation.OnCreate;
import com.iregor.validation.OnUpdate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StateController {

    private final StateService stateService;

    @PostMapping("/process-templates/{processTemplateId}/state-templates/{stateTemplateId}")
    public StateOutcomeDto createState(@RequestBody @Validated(OnCreate.class) StateIncomeDto stateIncomeDto,
                                       @PathVariable @PositiveOrZero Long processTemplateId,
                                       @PathVariable @PositiveOrZero Long stateTemplateId) {
        StateOutcomeDto stateOutcomeDto = stateService.createState(stateIncomeDto, processTemplateId, stateTemplateId);
        //add logging
        return stateOutcomeDto;
    }

    @GetMapping("/states/{id}")
    public StateOutcomeDto findStateById(@PathVariable @PositiveOrZero Long id) {
        StateOutcomeDto stateOutcomeDto = stateService.findStateById(id);
        //add logging
        return stateOutcomeDto;
    }

    @GetMapping("/process-templates/{processTemplateId}/states")
    public List<StateOutcomeDto> findAllProcessTemplateStates(@PathVariable @PositiveOrZero Long processTemplateId,
                                                              @RequestParam(defaultValue = "0") @PositiveOrZero int page,
                                                              @RequestParam(defaultValue = "10") @Positive int size) {
        List<StateOutcomeDto> states = stateService.findAllTemplateStates(processTemplateId, page, size);
        //add logging
        return states;
    }

    @GetMapping("/processes/{processId}/possible-states")
    List<StateOutcomeDto> findPossibleProcessStates(@PathVariable @PositiveOrZero Long processId) {
        List<StateOutcomeDto> states = stateService.findPossibleProcessStates(processId);
        //add logging
        return states;
    }

    @GetMapping("/states")
    List<StateOutcomeDto> findStatesByParams(@RequestParam Map<String, String> requestParams) {
        List<StateOutcomeDto> states = stateService.findStatesByParams(requestParams);
        //add logging
        return states;
    }

    @DeleteMapping("/states/{id}")
    public void deleteStateById(@PathVariable @PositiveOrZero Long id) {
        stateService.deleteStateById(id);
        //add logging
    }

    @PatchMapping("/states/{id}")
    public StateOutcomeDto patchState(@RequestBody @Validated(OnUpdate.class) StateIncomeDto stateIncomeDto,
                                      @PathVariable @PositiveOrZero Long id) {
        StateOutcomeDto stateOutcomeDto = stateService.patchState(stateIncomeDto, id);
        //add logging
        return stateOutcomeDto;
    }
}
