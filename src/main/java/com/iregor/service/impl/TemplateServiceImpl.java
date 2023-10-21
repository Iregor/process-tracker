package com.iregor.service.impl;

import com.iregor.repository.TemplateRepository;
import com.iregor.service.TemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemplateServiceImpl implements TemplateService {
    private final TemplateRepository templateRepository;

}
