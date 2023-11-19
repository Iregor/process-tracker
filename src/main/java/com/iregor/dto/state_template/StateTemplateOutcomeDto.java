package com.iregor.dto.state_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StateTemplateOutcomeDto {
    private Long id;
    private String name;
    private String description;
    private Long categoryId;
    private Long architectId;
    private LocalDateTime designed_date;
}
