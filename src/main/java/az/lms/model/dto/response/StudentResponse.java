package az.lms.model.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentResponse {
    String FIN;
    String name;
    String email;
    String surName;
    String studentGroup;
    LocalDate birthDate;
    String address;
}
