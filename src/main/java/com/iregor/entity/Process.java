package com.iregor.entity;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;

@Entity
@Table(name = "processes")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "object_id")
    @NotNull
    @PositiveOrZero
    private Long objectId;
    @Column(name = "owner_id")
    @NotNull
    @PositiveOrZero
    private Long ownerId;
    @ManyToOne
    @JoinColumn (name = "template_id")
    @NotNull
    private Template template;
    @ManyToOne
    @JoinColumn(name = "state_id")
    @NotNull
    private State state;
    @Column(name = "start_date")
    @NotNull
    private LocalDateTime startDate;
    @Column(name = "end_date")
    @Nullable
    private LocalDateTime endDate;
}
