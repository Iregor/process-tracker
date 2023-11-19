package com.iregor.dto.process;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessParams {
    private Long objectId;
    private Long templateId;
    private Long stateId;
    private Long ownerId;
    private String descriptionPart;
    private LocalDateTime startBefore;
    private LocalDateTime startAfter;
    private LocalDateTime endBefore;
    private LocalDateTime endAfter;
    private String processStatus;
    private int page;
    private int size;
}
