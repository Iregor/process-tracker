package com.iregor.mapper;

import com.iregor.dto.state_template.StateTemplateIncomeDto;
import com.iregor.dto.state_template.StateTemplateOutcomeDto;
import com.iregor.entity.Category;
import com.iregor.entity.StateTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StateTemplateMapper {

    /*@Mapping(target = "category", source = "category")
    @Mapping(target = "name", source = "stateIncomeDto.name")
    @Mapping(target = "description", source = "stateIncomeDto.description")
    @Mapping(target = "architectId", source = "stateIncomeDto.architectId")
    StateTemplate stateIncomeDtoToState(StateTemplateIncomeDto stateIncomeDto, Category category);


    StateTemplateOutcomeDto stateToStateOutcomeDto(StateTemplate state);*/
}
