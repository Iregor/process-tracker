package com.iregor.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transitions")
public class Transition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private Template template;
    @NotNull
    private State fromState;
    @NotNull
    private State toState;

}
