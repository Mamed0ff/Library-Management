package az.lms.service;

import az.lms.model.dto.request.LibrarianRequest;
import az.lms.model.dto.response.LibrarianResponse;

import java.util.List;

public interface LIbrarianService {
    void createLibrarian(LibrarianRequest request);
    List<LibrarianResponse> getAllLibrarian();
    void deleteLibrarian(Long id);
    LibrarianResponse getLibrarianById(Long id);
    void updateLibrarian(Long id, LibrarianRequest request);
}
