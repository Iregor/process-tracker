package com.iregor.entity;

import com.iregor.entity.supp.StateInTemplateId;
import com.iregor.entity.supp.StateType;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "states_in_templates")
public class StateInTemplate {
    @EmbeddedId
    private StateInTemplateId stateInTemplateId;
    private boolean isFastTracked;
    @NotNull
    private StateType type;
}
