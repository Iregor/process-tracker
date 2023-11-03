package com.iregor.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transitions")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "template_id")
    @NotNull
    private Template template;
    @ManyToOne
    @JoinColumn(name = "from_state_id")
    @NotNull
    private State fromState;
    @ManyToOne
    @JoinColumn(name = "to_state_id")
    @NotNull
    private State toState;
}
