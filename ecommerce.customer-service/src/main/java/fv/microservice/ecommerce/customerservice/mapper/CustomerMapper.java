package fv.microservice.ecommerce.customerservice.mapper;

import fv.microservice.ecommerce.customerservice.dto.CustomerRequest;
import fv.microservice.ecommerce.customerservice.dto.CustomerResponse;
import fv.microservice.ecommerce.customerservice.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponse customerToCustomerResponse(Customer customer);
    Customer customerRequestToCustomer(CustomerRequest customerRequest);
}
