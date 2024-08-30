package az.lms.model.dto.request;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryRequest {
    @NotBlank(message = "Invalid Name: Empty name")
    @Size(max = 25, min = 2, message = "Invalid Name: Must be of 2 - 255 characters")
    @ApiModelProperty(name = "Category name", required = true, notes = "Category must be unique")
    String name;

    @NotBlank(message = "Invalid Name: Empty description")
    @Size(max = 255, min = 5, message = "Invalid Name: Must be of 5 - 255 characters")
    @ApiModelProperty(name = "Category description")
    String description;

    @NotBlank(message = "Invalid Name: Empty description")
    @Size(max = 255, min = 5, message = "Invalid Name: Must be of 5 - 255 characters")
    @ApiModelProperty(name = "Category type: Fiction / Non-fiction")
    String type;
}
