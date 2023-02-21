package fv.microservice.ecommerce.customerservice.web;

import fv.microservice.ecommerce.customerservice.dto.CustomerRequest;
import fv.microservice.ecommerce.customerservice.dto.CustomerResponse;
import fv.microservice.ecommerce.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/customer/")
@RefreshScope
@RequiredArgsConstructor
public class CustomerController implements CustomerApi {

    private final CustomerService customerService;

    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        return customerService.create(customerRequest);
    }

    @Override
    public CustomerResponse getById(String customerId) {
        return customerService.getById(customerId);
    }

    @Override
    public List<CustomerResponse> all() {
        return customerService.all();
    }
}
