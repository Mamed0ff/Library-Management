package az.lms.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, unique = true)
    String isbn;
    String image;
    int count;
    @Column(nullable = false)
    String name;
    LocalDate publishedDate;
    String description;
    String details;

    @ManyToMany(mappedBy = "books")
    @JsonBackReference
    Set<Author> authors;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @JsonBackReference
    Category categories;

    public Set<Author> getAuthors() {
        if (authors == null) {
            authors = new HashSet<>();
        }
        return authors;
    }
}
