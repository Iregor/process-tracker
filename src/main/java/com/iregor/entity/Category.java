package com.iregor.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Size(min = 10)
    private String name;
    @Nullable
    private String description;
    @Column(name = "architect_id")
    @PositiveOrZero
    private long architectId;
    @NotNull
    @Column(name = "designed_date")
    private LocalDateTime designedDate;
}
