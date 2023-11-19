package com.iregor.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "transitions")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Transition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_state_id")
    private State fromState;

    @ManyToOne
    @JoinColumn(name = "to_state_id")
    private State toState;

    @Column(name = "architect_id")
    private Long architectId;
}