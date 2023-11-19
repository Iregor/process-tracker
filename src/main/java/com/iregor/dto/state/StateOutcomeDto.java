package com.iregor.dto.state;

import com.iregor.entity.supp.StateType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StateOutcomeDto {
    private Long processTemplateId;
    private Long stateTemplateId;
    private Boolean isFastTracked;
    private StateType type;
}
