package az.lms.mapper;

import az.lms.model.dto.request.LibrarianRequest;
import az.lms.model.dto.response.LibrarianResponse;
import az.lms.model.entity.Librarian;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedSourcePolicy = ReportingPolicy.IGNORE,
unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LibrarianMapper {
    LibrarianResponse modelToResponse(Librarian librarian);
    Librarian requestToModel(LibrarianRequest request);
}
