package com.iregor.controller;

import com.iregor.dto.category.CategoryIncomeDto;
import com.iregor.dto.category.CategoryOutcomeDto;
import com.iregor.service.CategoryService;
import com.iregor.validation.OnCreate;
import com.iregor.validation.OnUpdate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@RestController
@RequestMapping("/categories")
@Slf4j
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public CategoryOutcomeDto createCategory(@RequestBody @Validated(OnCreate.class) CategoryIncomeDto categoryIncomeDto,
                                             @RequestHeader("architect-id") @PositiveOrZero @NotNull Long architectId) {
        CategoryOutcomeDto categoryOutcomeDto = categoryService.createCategory(categoryIncomeDto, architectId);
        //add logging
        return categoryOutcomeDto;
    }

    @GetMapping("/{id}")
    public CategoryOutcomeDto findCategoryById(@PathVariable @PositiveOrZero Long id) {
        CategoryOutcomeDto categoryOutcomeDto = categoryService.findCategoryById(id);
        //add logging
        return categoryOutcomeDto;
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable @PositiveOrZero Long id) {
        categoryService.deleteCategory(id);
        //add logging
    }

    @PatchMapping("/{id}")
    public CategoryOutcomeDto patchCategory(@RequestBody @Validated(OnUpdate.class) CategoryIncomeDto categoryIncomeDto,
                                            @PathVariable @PositiveOrZero Long id) {
        CategoryOutcomeDto categoryOutcomeDto = categoryService.patchCategory(categoryIncomeDto, id);
        //add logging
        return categoryOutcomeDto;
    }
}