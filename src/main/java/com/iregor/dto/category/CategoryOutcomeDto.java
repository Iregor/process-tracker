package com.iregor.dto.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryOutcomeDto {
    private Long id;
    private String name;
    private String description;
    private Long architectId;
    private LocalDateTime designedDate;
}
