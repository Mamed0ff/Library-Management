package az.lms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class AlreadyExistsException extends RuntimeException {
    private final HttpStatus status = HttpStatus.CONFLICT;
    private final String message;
}
