package az.lms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
public class InsufficentCountException extends RuntimeException {
    private final HttpStatus status = HttpStatus.CONFLICT;
    private final String message;
}
