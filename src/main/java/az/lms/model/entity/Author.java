package az.lms.model.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="authors")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="first_name",nullable = false, length = 25)
    String name;
    String surname;
    String biography;
    LocalDate birthDay;

    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="authors_book",
    joinColumns = @JoinColumn(name="authors_id"),
            inverseJoinColumns = @JoinColumn(name="books_id")
    )
    Set<Book> books;

    public void addBook(Book book) {
        books.add(book);
        book.getAuthors().add(this);
    }
}
