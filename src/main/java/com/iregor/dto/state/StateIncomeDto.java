package com.iregor.dto.state;

import com.iregor.entity.supp.StateType;
import com.iregor.validation.OnCreate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PositiveOrZero;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StateIncomeDto {
    @Null(groups = OnCreate.class)
    @Nullable//onUpdate
    @PositiveOrZero
    private Long processTemplateId;

    @Null(groups = OnCreate.class)
    @Nullable//onUpdate
    @PositiveOrZero
    private Long StateTemplateId;

    @NotNull(groups = OnCreate.class)
    @Nullable//onUpdate
    private Boolean isFastTracked;

    @NotNull(groups = OnCreate.class)
    @Nullable//onUpdate
    private StateType type;
}
