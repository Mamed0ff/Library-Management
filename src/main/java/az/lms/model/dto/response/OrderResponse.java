package az.lms.model.dto.response;

import az.lms.model.enums.RoleType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponse {
    String email;
    String name;
    String surname;
    RoleType roleType;
}
