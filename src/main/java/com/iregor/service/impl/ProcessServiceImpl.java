package com.iregor.service.impl;

import com.iregor.repository.ProcessRepository;
import com.iregor.service.ProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcessServiceImpl implements ProcessService {
    private final ProcessRepository processRepository;

}
