package fv.microservice.ecommerce.orderservice.web;

import fv.microservice.ecommerce.orderservice.dto.OrderRequest;
import fv.microservice.ecommerce.orderservice.dto.OrderResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderApi {
    @PostMapping(value = "create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    OrderResponse create(@RequestBody OrderRequest orderRequest);
    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    OrderResponse getById(@PathVariable String id);
    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<OrderResponse> all();
}
