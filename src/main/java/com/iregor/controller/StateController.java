package com.iregor.controller;

import com.iregor.service.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StateController {
    private final StateService stateService;
}
