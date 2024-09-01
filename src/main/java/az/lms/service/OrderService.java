package az.lms.service;

import az.lms.model.dto.request.OrderRequest;
import az.lms.model.dto.response.OrderResponse;

import java.util.List;

public interface OrderService {
    List<OrderResponse> getOrders();
    void borrowOrder(OrderRequest request);
    void returnOrder(OrderRequest request);
}
