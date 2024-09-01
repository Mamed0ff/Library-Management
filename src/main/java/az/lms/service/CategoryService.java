package az.lms.service;

import az.lms.model.dto.request.CategoryRequest;
import az.lms.model.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    void createCategory(CategoryRequest request);
    List<CategoryResponse> getAllCategory();
    CategoryResponse getCategoryById(Long id);
    void updateCategory(Long id ,CategoryRequest request);
    void deleteCategoryById(Long id);
}
