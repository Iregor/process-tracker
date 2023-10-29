package com.iregor.entity.supp;

import com.iregor.entity.State;
import com.iregor.entity.Template;
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
    private State state;
    @ManyToOne
    @JoinColumn(name = "template_id")
    private Template template;
}