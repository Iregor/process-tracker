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
public class StateParams {
    private String stateTemplateNamePart;
    private String stateTemplateDescriptionPart;
    private Long processTemplateId;
    private Long stateTemplateId;
    private boolean isFastTracked;
    private StateType stateType;
}
