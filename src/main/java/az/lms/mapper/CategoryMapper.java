package az.lms.mapper;

import az.lms.model.dto.request.CategoryRequest;
import az.lms.model.dto.response.CategoryResponse;
import az.lms.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedSourcePolicy = ReportingPolicy.IGNORE,
unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {
    CategoryResponse modelToResponse(Category category);
    Category requestToModel(CategoryRequest request);
}
