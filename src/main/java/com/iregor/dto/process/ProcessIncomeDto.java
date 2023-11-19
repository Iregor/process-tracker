package com.iregor.dto.process;

import com.iregor.validation.OnCreate;
import com.iregor.validation.OnUpdate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProcessIncomeDto {
    @Nullable
    @Size(min = 5, max = 500)
    private String description;

    @NotNull(groups = OnCreate.class)
    @Null(groups = OnUpdate.class)
    @PositiveOrZero
    private Long objectId;

    @Null(groups = OnCreate.class)
    @PositiveOrZero
    private Long stateId;
}