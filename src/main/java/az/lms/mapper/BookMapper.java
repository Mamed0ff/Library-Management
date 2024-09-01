package az.lms.mapper;

import az.lms.model.dto.request.BookRequest;
import az.lms.model.dto.response.BookResponse;
import az.lms.model.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedSourcePolicy = ReportingPolicy.IGNORE,
unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {
    @Mapping(target = "categories.id", source = "categoriesId")
    Book requestToBook(BookRequest request);
    BookResponse bookToResponse(Book book);
}
