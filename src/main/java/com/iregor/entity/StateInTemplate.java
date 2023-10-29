package com.iregor.entity;

import com.iregor.entity.supp.StateInTemplateId;
import com.iregor.entity.supp.StateType;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "states_in_templates")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StateInTemplate {
    @EmbeddedId
    private StateInTemplateId stateInTemplateId;
    @Column(name = "is_fast_tracked")
    @NotNull
    private Boolean isFastTracked;
    @Column(name = "type")
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private StateType type;
}
