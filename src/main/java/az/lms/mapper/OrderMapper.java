package az.lms.mapper;

import az.lms.model.dto.request.OrderRequest;
import az.lms.model.dto.response.OrderResponse;
import az.lms.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {
    OrderResponse modelToResponse(Order order);
    Order requestToModel(OrderRequest request);
}
