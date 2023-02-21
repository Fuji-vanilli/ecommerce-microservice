package fv.microservice.ecommerce.inventoryservice.web;

import fv.microservice.ecommerce.inventoryservice.dto.ProductRequest;
import fv.microservice.ecommerce.inventoryservice.dto.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductApi {
    @PostMapping("create")
    ProductResponse create(@RequestBody ProductRequest productRequest);
    @GetMapping("get/{id}")
    ProductResponse getById(@PathVariable("id") String productId);
    @GetMapping("all")
    List<ProductResponse> all();
}
