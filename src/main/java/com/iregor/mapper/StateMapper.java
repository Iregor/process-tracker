package com.iregor.mapper;

import com.iregor.entity.Category;
import com.iregor.entity.dto.StateOutcomeDto;
import com.iregor.entity.State;
import com.iregor.entity.dto.StateIncomeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StateMapper {

    @Mapping(target = "category", source = "category")
    StateIncomeDto stateIncomeDtoToState(StateIncomeDto stateIncomeDto, Category category);


    StateOutcomeDto stateToStateOutcomeDto(State state);
}
