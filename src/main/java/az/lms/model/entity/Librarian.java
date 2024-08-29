package az.lms.model.entity;

import az.lms.model.enums.RoleType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "librarian")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String email;
    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    String surname;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    RoleType roleType;

}
