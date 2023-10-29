package com.iregor.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StateIncomeDto {
    @NotNull
    @Size(min = 5)
    private String name;
    @Nullable
    private String description;
    @Nullable
    private Long categoryId;
    @PositiveOrZero
    private long architectId;
    @NotNull
    private LocalDateTime designed_date;
}
