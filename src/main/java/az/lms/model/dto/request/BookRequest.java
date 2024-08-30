package az.lms.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookRequest {
    @NotBlank(message = "name can't be empty")
    String name;
    @NotBlank(message = "isbn can't be empty")
    String isbn;
    @Positive(message = "count can't be negative value")
    int count;
    @NotBlank(message = "details shouldn't be empty")
    String image;
    @NotBlank(message = "details shouldn't be empty")
    String details;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate publishedDate;
    @NotNull
    Long categoriesId;
    @Size(min=5,max=25)
    String description;
    @NotNull
    Long authorId;

}
