package com.iregor.service;

import com.iregor.dto.category.CategoryIncomeDto;
import com.iregor.dto.category.CategoryOutcomeDto;

public interface CategoryService {
    CategoryOutcomeDto createCategory(CategoryIncomeDto categoryIncomeDto, Long architectId);

    CategoryOutcomeDto findCategoryById(Long id);

    void deleteCategory(Long id);

    CategoryOutcomeDto patchCategory(CategoryIncomeDto categoryIncomeDto, Long id);
}
