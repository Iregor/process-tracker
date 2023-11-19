package com.iregor.controller;

import com.iregor.dto.process.ProcessIncomeDto;
import com.iregor.dto.process.ProcessOutcomeDto;
import com.iregor.dto.process.ProcessParams;
import com.iregor.service.ProcessService;
import com.iregor.validation.OnCreate;
import com.iregor.validation.OnUpdate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/processes")
@Slf4j
@RequiredArgsConstructor
public class ProcessController {

    private final ProcessService processService;

    @PostMapping
    public ProcessOutcomeDto createProcess(@RequestBody @Validated(OnCreate.class) ProcessIncomeDto processIncomeDto,
                                           @RequestHeader("owner-id") @PositiveOrZero @NotNull Long ownerId) {
        ProcessOutcomeDto processOutcomeDto = processService.createProcess(processIncomeDto, ownerId);
        //add logging
        return processOutcomeDto;
    }

    @GetMapping("/{id}")
    public ProcessOutcomeDto findProcessById(@PathVariable @PositiveOrZero Long id) {
        ProcessOutcomeDto processOutcomeDto = processService.findProcessById(id);
        //add logging
        return processOutcomeDto;
    }

    @GetMapping("/params")
        //монструозная конструкция - технический долг:) Потом переведу в @RequestParam Map<String, String> allParams
    List<ProcessOutcomeDto> findProcessesByParams(@RequestParam(required = false) @PositiveOrZero Long objectId,
                                                  @RequestParam(required = false) @PositiveOrZero Long templateId,
                                                  @RequestParam(required = false) @PositiveOrZero Long stateId,
                                                  @RequestParam(required = false) @PositiveOrZero Long ownerId,
                                                  @RequestParam(required = false) @Size(min = 3, max = 500) String descriptionPart,
                                                  @RequestParam(required = false) @Past @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime startAfter,
                                                  @RequestParam(required = false) @Past @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime startBefore,
                                                  @RequestParam(required = false) @Past @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime endAfter,
                                                  @RequestParam(required = false) @PastOrPresent @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime endBefore,
                                                  @RequestParam(required = false) String processStatus /*"finished" or "in process" */,
                                                  @RequestParam(defaultValue = "0") @PositiveOrZero int page,
                                                  @RequestParam(defaultValue = "10") @Positive int size) {
        ProcessParams params = ProcessParams.builder()
                .objectId(objectId)
                .templateId(templateId)
                .stateId(stateId)
                .ownerId(ownerId)
                .descriptionPart(descriptionPart)
                .startBefore(startBefore)
                .startAfter(startAfter)
                .processStatus(processStatus)
                .endBefore(endBefore)
                .endAfter(endAfter)
                .page(page)
                .size(size)
                .build();
        List<ProcessOutcomeDto> processes = processService.findProcessesByParams(params);
        //add logging
        return processes;
    }

    @DeleteMapping("/{id}")
    public void deleteProcess(@PathVariable @PositiveOrZero Long id) {
        processService.deleteProcess(id);
        //add logging
    }

    @PatchMapping("/{id}")
    public ProcessOutcomeDto patchProcess(@RequestBody @Validated(OnUpdate.class) ProcessIncomeDto processIncomeDto,
                                          @PathVariable @PositiveOrZero Long id) {
        ProcessOutcomeDto processOutcomeDto = processService.patchProcess(processIncomeDto, id);
        //add logging
        return processOutcomeDto;
    }
}
