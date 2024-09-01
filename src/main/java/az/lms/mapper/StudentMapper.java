package az.lms.mapper;

import az.lms.model.dto.request.StudentRequest;
import az.lms.model.dto.response.StudentResponse;
import az.lms.model.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {
    Student requestToEntity(StudentRequest request);
    StudentResponse entityToResponse(Student student);
}
