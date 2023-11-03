package com.iregor.service.impl;

import com.iregor.repository.TransitionRepository;
import com.iregor.service.TransitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransitionServiceImpl implements TransitionService {
    private final TransitionRepository transitionRepository;

}
