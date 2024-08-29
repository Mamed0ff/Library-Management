package az.lms.model.entity;

import az.lms.model.enums.RoleType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true, nullable = false, length = 20,updatable = false)
    String FIN;
    @Column(nullable = false)
    String email;
    @Column(nullable = false, length = 40)
    String name;
    @Column(nullable = false,length = 55)
    String surname;
    @Column(nullable = false)
    String password;
    LocalDate birthDate;
    @Column(length = 10, nullable = false)
    String studentGroup;
    @Column(length = 100)
    String address;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    RoleType roleType;

}
