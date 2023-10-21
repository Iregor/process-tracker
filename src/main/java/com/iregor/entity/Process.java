package com.iregor.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;

@Entity
@Table(name = "processes")
public class Process {
    @PositiveOrZero
    private long objectId;
    @PositiveOrZero
    private long ownerId;
    @NotNull
    private Template template;
    @NotNull
    private State state;
    @NotNull
    private LocalDateTime startDate;
    @Nullable
    private LocalDateTime endDate;
}
