package az.lms.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthorRequest {
    @NotBlank(message = "Name cannot be empty")
    @Size(max = 25, min = 2,message = "Invalid Name: Must be of 2 - 25 characters")
    String name;

    @Size(max = 30, min = 3,message = "Invalid Surname: Must be of 3 - 30 characters")
    String surname;

    @Size(max = 200, message = "Limit exceeded : Must be of max 200 characters")
    String biography;

    @NotNull(message = "Invalid birthday: Birthday is NULL")
    @Past(message = "Date should not be in the future")
    LocalDate birthday;
}
