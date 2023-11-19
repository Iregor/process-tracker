package com.iregor.dto.process_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProcessTemplateOutcomeDto {
    private Long id;
    private String name;
    private String description;
    private Long architectId;
    private LocalDateTime designedDate;
}
