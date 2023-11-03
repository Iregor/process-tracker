package com.iregor.entity;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "categories")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    @NotNull
    @Size(min = 10)
    private String name;
    @Column(name = "description")
    @Nullable
    private String description;
    @Column(name = "architect_id")
    @NotNull
    @PositiveOrZero
    private Long architectId;
    @Column(name = "designed_date")
    @NotNull
    private LocalDateTime designedDate;
}
