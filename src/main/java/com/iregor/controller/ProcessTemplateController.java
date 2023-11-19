package com.iregor.controller;

import com.iregor.dto.process_template.ProcessTemplateIncomeDto;
import com.iregor.dto.process_template.ProcessTemplateOutcomeDto;
import com.iregor.service.ProcessTemplateService;
import com.iregor.validation.OnCreate;
import com.iregor.validation.OnUpdate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@RestController
@RequestMapping("/templates")
@Slf4j
@RequiredArgsConstructor
public class ProcessTemplateController {

    private final ProcessTemplateService processTemplateService;

    @PostMapping
    public ProcessTemplateOutcomeDto createProcessTemplate(@RequestBody @Validated(OnCreate.class) ProcessTemplateIncomeDto templateIncomeDto,
                                                           @RequestHeader("architect-id") @PositiveOrZero @NotNull Long architectId) {
        ProcessTemplateOutcomeDto templateOutcomeDto = processTemplateService.createTemplate(templateIncomeDto, architectId);
        //add logging
        return templateOutcomeDto;
    }

    @GetMapping("/{id}")
    public ProcessTemplateOutcomeDto findProcessTemplateById(@PathVariable @PositiveOrZero Long id) {
        ProcessTemplateOutcomeDto templateOutcomeDto = processTemplateService.findTemplateById(id);
        //add logging
        return templateOutcomeDto;
    }

    @DeleteMapping("/{id}")
    public void deleteProcessTemplate(@PathVariable @PositiveOrZero Long id) {
        processTemplateService.deleteTemplate(id);
        //add logging
    }

    @PatchMapping("/{id}")
    public ProcessTemplateOutcomeDto patchProcessTemplate(@RequestBody @Validated(OnUpdate.class) ProcessTemplateIncomeDto templateIncomeDto,
                                                          @PathVariable @PositiveOrZero Long id) {
        ProcessTemplateOutcomeDto templateOutcomeDto = processTemplateService.patchTemplate(templateIncomeDto, id);
        //add logging
        return templateOutcomeDto;
    }
}
