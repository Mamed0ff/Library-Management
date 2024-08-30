package az.lms.model.dto.request;

import az.lms.model.enums.OrderType;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {
    @ApiModelProperty(notes = "Student ID", example = "1", required = true)
    @NotNull(message = "Student ID cannot be empty")
    Long studentId;
    @ApiModelProperty(notes = "Book ID", example = "1", required = true)
    @NotNull(message = "Book ID cannot be empty")
    Long bookId;
    @ApiModelProperty(notes = "Order type", example = "BORROWED/RETURNED", required = true)
    @NotNull(message = "Order type cannot be empty")
    OrderType orderType;
}
