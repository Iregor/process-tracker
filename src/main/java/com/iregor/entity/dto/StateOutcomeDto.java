package com.iregor.entity.dto;

import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class StateOutcomeDto {
    @PositiveOrZero
    private long id;
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
