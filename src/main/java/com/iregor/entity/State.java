package com.iregor.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "states")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Size(min = 5)
    private String name;
    @Nullable
    private String description;
    @Nullable
    private Category category;
    @Column(name = "architect_id")
    @PositiveOrZero
    private long architectId;
    @NotNull
    private LocalDateTime designed_date;
}
