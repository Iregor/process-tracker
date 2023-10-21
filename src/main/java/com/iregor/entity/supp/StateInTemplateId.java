package com.iregor.entity.supp;

import com.iregor.entity.State;
import com.iregor.entity.Template;
import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class StateInTemplateId implements Serializable {
    private State state;
    private Template template;
}
