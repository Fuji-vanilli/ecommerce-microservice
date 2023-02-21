package fv.microservice.ecommerce.customerservice.service;

import fv.microservice.ecommerce.customerservice.dto.CustomerRequest;
import fv.microservice.ecommerce.customerservice.dto.CustomerResponse;

import java.util.List;

public interface ICustomerService {
    CustomerResponse create(CustomerRequest customerRequest);
    CustomerResponse getById(String id);
    List<CustomerResponse> all();
}
