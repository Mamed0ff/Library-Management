package az.lms.model.dto.response;

import az.lms.model.enums.RoleType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LibrarianResponse {
    String email;
    String name;
    String surname;
    RoleType roleType;
}
