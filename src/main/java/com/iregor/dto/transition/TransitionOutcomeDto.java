package com.iregor.dto.transition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransitionOutcomeDto {
    private Long id;
    private Long fromStateId;
    private Long toStateId;
    private Long architectId;
}