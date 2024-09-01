package az.lms.service.impls;

import az.lms.mapper.AuthorMapper;
import az.lms.model.dto.request.AuthorRequest;
import az.lms.model.dto.response.AuthorResponse;
import az.lms.model.entity.Author;
import az.lms.model.entity.Book;
import az.lms.repository.AuthorRepository;
import az.lms.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public void createAuthor(AuthorRequest request) {
        Author author = authorMapper.requestToModel(request);
        authorRepository.save(author);
        log.info("Created new author \n" + author);
    }

    @Override
    public List<AuthorResponse> getAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        List<AuthorResponse> authorResponses = authors.stream().map(author->authorMapper.modelToResponse(author)).collect(Collectors.toList());
        log.info("Getting all authors.All author`s count {}", authorResponses.size());
        return authorResponses;
    }

    @Override
    public void deleteAuthor(Long id) {

    }

    @Override
    public AuthorResponse getAuthorById(Long id) {
        return null;
    }

    @Override
    public void updateAuthor(Long id, AuthorRequest request) {

    }

    @Override
    public List<Book> getBooksByAuthor(Long authorId) {
        return List.of();
    }
}
