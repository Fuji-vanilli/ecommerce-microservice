package fv.microservice.ecommerce.customerservice.service;

import fv.microservice.ecommerce.customerservice.dto.CustomerRequest;
import fv.microservice.ecommerce.customerservice.dto.CustomerResponse;
import fv.microservice.ecommerce.customerservice.mapper.CustomerMapper;
import fv.microservice.ecommerce.customerservice.model.Customer;
import fv.microservice.ecommerce.customerservice.repositorie.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class CustomerService implements ICustomerService{

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        Customer customer= customerMapper.customerRequestToCustomer(customerRequest);

        customer.setId(UUID.randomUUID().toString());

        return customerMapper.customerToCustomerResponse(
                customerRepository.save(customer)
        );
    }

    @Override
    public CustomerResponse getById(String id) {
        return customerMapper.customerToCustomerResponse(
                customerRepository.findById(id).get()
        );
    }

    @Override
    public List<CustomerResponse> all() {
        return customerRepository.findAll()
                .stream()
                .map(customer -> customerMapper.customerToCustomerResponse(customer))
                .collect(Collectors.toList());
    }
}
