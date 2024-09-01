package az.lms.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class AgeLimitException extends RuntimeException {
    private final HttpStatus status=HttpStatus.BAD_REQUEST;
    public AgeLimitException(String message) {
        super("The age limit is not appropriate");
    }
}
