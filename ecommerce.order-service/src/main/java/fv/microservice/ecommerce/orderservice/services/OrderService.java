package fv.microservice.ecommerce.orderservice.services;

import fv.microservice.ecommerce.orderservice.dto.OrderRequest;
import fv.microservice.ecommerce.orderservice.dto.OrderResponse;
import fv.microservice.ecommerce.orderservice.entities.Order;
import fv.microservice.ecommerce.orderservice.mapper.OrderMapper;
import fv.microservice.ecommerce.orderservice.models.Customer;
import fv.microservice.ecommerce.orderservice.openFeign.OrderRestClientService;
import fv.microservice.ecommerce.orderservice.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class OrderService implements IOrderService{

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderRestClientService orderRestClientService;

    @Override
    public OrderResponse create(OrderRequest orderRequest) {
        Order order= orderMapper.orderRequestToOrder(orderRequest);

        order.setId(UUID.randomUUID().toString());
        Customer customer= orderRestClientService.getCustomerById(order.getCustomerId());

        order.setCustomer(customer);

        return orderMapper.orderToOrderResponse(
                orderRepository.save(order)
        );
    }

    @Override
    public OrderResponse getById(String id) {
        return orderMapper.orderToOrderResponse(
                orderRepository.findById(id).get()
        );
    }

    @Override
    public List<OrderResponse> all() {
        return orderRepository.findAll()
                .stream()
                .map(order -> orderMapper.orderToOrderResponse(order))
                .collect(Collectors.toList());
    }
}
