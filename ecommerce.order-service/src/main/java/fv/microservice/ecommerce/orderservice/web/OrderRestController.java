package fv.microservice.ecommerce.orderservice.web;

import fv.microservice.ecommerce.orderservice.dto.OrderRequest;
import fv.microservice.ecommerce.orderservice.dto.OrderResponse;
import fv.microservice.ecommerce.orderservice.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderRestController implements OrderApi{

    private final OrderService orderService;

    @Override
    public OrderResponse create(OrderRequest orderRequest) {
        return orderService.create(orderRequest);
    }

    @Override
    public OrderResponse getById(String id) {
        return orderService.getById(id);
    }

    @Override
    public List<OrderResponse> all() {
        return orderService.all();
    }
}
