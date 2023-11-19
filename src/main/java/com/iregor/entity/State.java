package com.iregor.entity;

import com.iregor.entity.supp.StateType;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "embedded_states")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "process_template_id")
    private ProcessTemplate processTemplate;

    @ManyToOne
    @JoinColumn(name = "state_template_id")
    private StateTemplate stateTemplate;

    @Column(name = "is_fast_tracked")
    private Boolean isFastTracked;

    @Column(name = "state_type")
    @Enumerated(EnumType.ORDINAL)
    private StateType stateType;
}
