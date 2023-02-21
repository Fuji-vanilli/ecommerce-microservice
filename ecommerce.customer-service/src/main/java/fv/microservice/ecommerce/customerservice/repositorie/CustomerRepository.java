package fv.microservice.ecommerce.customerservice.repositorie;

import fv.microservice.ecommerce.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
