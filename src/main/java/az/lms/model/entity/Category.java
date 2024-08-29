package az.lms.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="categories")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true, nullable = false)
    String name;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    String type;

    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "categories")
    List<Book> books;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name=" + name + '\''+
                ", description=" + description + '\''+
                "}";
    }
}
