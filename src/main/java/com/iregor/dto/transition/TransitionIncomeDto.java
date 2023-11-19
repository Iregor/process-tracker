package com.iregor.dto.transition;

import com.iregor.validation.OnCreate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransitionIncomeDto {
    @NotNull(groups = OnCreate.class)
    @Nullable //onUpdate
    @PositiveOrZero
    private Long fromStateId;

    @NotNull(groups = OnCreate.class)
    @Nullable //onUpdate
    @PositiveOrZero
    private Long toStateId;
}
