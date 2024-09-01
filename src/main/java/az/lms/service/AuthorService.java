package az.lms.service;

import az.lms.model.dto.request.AuthorRequest;
import az.lms.model.dto.response.AuthorResponse;
import az.lms.model.entity.Author;
import az.lms.model.entity.Book;

import java.util.List;

public interface AuthorService {
    void createAuthor(AuthorRequest request);
    List<AuthorResponse> getAllAuthors();
    void deleteAuthor(Long id);
    AuthorResponse getAuthorById(Long id);
    void updateAuthor(Long id, AuthorRequest request);
    List<Book> getBooksByAuthor(Long authorId);
}
