package az.lms.model.dto.response;

import az.lms.model.entity.Book;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthorResponse {
    Long id;
    String name;
    String surname;
    String biography;
    LocalDate birthDay;
    Set<Book> books;
}
