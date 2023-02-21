package fv.microservice.ecommerce.customerservice.web;

import fv.microservice.ecommerce.customerservice.dto.CustomerRequest;
import fv.microservice.ecommerce.customerservice.dto.CustomerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerApi {
    @PostMapping("create")
    CustomerResponse create(@RequestBody CustomerRequest customerRequest);
    @GetMapping("get/{id}")
    CustomerResponse getById(@PathVariable("id") String customerId);
    @GetMapping("all")
    List<CustomerResponse> all();
}
