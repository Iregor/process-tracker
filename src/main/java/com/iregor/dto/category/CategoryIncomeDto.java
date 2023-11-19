package com.iregor.dto.category;

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
public class CategoryIncomeDto {
    @NotNull(groups = OnCreate.class)
    @Nullable //onUpdate
    @Size(min = 5, max = 100)
    private String name;

    @Size(min = 5, max = 500)
    @Nullable
    private String description;
}
