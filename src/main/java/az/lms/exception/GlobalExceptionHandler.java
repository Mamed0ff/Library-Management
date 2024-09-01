package az.lms.exception;

import az.lms.model.dto.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.time.LocalDateTime;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {
            AgeLimitException.class,
            AlreadyExistsException.class,
            InsufficentCountException.class,
            NotFoundException.class,
            DataIntegrityViolationException.class
    })
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        log.error(ex.getMessage(), ex);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setDate(LocalDateTime.now());
        errorResponse.setStatus(getHttpStatus(ex));
        errorResponse.setErrorCode(errorResponse.getStatus().value());
        errorResponse.setErrorMessage(ex.getMessage());
        return ResponseEntity.status(errorResponse.getStatus()).body(errorResponse);
    }

    private HttpStatus getHttpStatus(Exception ex) {
        if ((ex instanceof AgeLimitException) || (ex instanceof MaxUploadSizeExceededException)) {
            return HttpStatus.BAD_REQUEST;
        } else if (ex instanceof NotFoundException) {
            return HttpStatus.NOT_FOUND;
        } else if ((ex instanceof AlreadyExistsException) ||
                (ex instanceof InsufficentCountException) ||
                (ex instanceof DataIntegrityViolationException)) {
            return HttpStatus.CONFLICT;
        } else {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
}
