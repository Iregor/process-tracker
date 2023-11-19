package com.iregor.entity.supp;

import com.iregor.entity.ProcessTemplate;
import com.iregor.entity.StateTemplate;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class StateInTemplateId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "state_id")
    private StateTemplate state;
    @ManyToOne
    @JoinColumn(name = "template_id")
    private ProcessTemplate template;
}