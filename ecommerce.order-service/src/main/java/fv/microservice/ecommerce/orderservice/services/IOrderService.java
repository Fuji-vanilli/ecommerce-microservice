package fv.microservice.ecommerce.orderservice.services;

import fv.microservice.ecommerce.orderservice.dto.OrderRequest;
import fv.microservice.ecommerce.orderservice.dto.OrderResponse;
import fv.microservice.ecommerce.orderservice.entities.Order;

import java.util.List;

public interface IOrderService {
    OrderResponse create(OrderRequest orderRequest);
    OrderResponse getById(String id);
    List<OrderResponse> all();
}
