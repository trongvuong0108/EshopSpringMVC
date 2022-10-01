package com.code.Service;

import com.code.Entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    public List<Category> getAllCategory();
    public void createCategory(Category category);
    public void updateCategory();
    public void disableCategory(UUID id);
    public void enableCategory(UUID id);
}
