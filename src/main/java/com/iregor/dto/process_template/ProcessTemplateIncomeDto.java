package com.iregor.dto.process_template;

import com.iregor.validation.OnCreate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProcessTemplateIncomeDto {
    @NotNull(groups = OnCreate.class)
    @Nullable //onUpdate
    @Size(min = 5, max = 100)
    private String name;

    @Nullable
    @Size(min = 5, max = 500)
    private String description;
}
