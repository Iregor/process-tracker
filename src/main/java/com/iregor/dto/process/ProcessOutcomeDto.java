package com.iregor.dto.process;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProcessOutcomeDto {
    private Long id;
    private String description;
    private Long objectId;
    private Long ownerId;
    private Long stateId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
