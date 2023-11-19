package com.iregor.service.impl;

import com.iregor.dto.category.CategoryIncomeDto;
import com.iregor.dto.category.CategoryOutcomeDto;
import com.iregor.repository.CategoryRepository;
import com.iregor.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryOutcomeDto createCategory(CategoryIncomeDto categoryIncomeDto, Long architectId) {
        return null;
    }

    @Override
    public CategoryOutcomeDto findCategoryById(Long id) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }

    @Override
    public CategoryOutcomeDto patchCategory(CategoryIncomeDto categoryIncomeDto, Long id) {
        return null;
    }
}
