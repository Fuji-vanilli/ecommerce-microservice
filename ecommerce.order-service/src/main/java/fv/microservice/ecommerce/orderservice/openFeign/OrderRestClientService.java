package fv.microservice.ecommerce.orderservice.openFeign;

import fv.microservice.ecommerce.orderservice.models.Customer;
import fv.microservice.ecommerce.orderservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient
public interface OrderRestClientService {
    @GetMapping("api/customer/get/{id}")
    Customer getCustomerById(@PathVariable String id);
    @GetMapping("api/inventory/geti/{id}")
    Product getProductById(@PathVariable String id);

}
