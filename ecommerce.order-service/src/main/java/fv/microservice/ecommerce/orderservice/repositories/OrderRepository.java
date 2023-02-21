package fv.microservice.ecommerce.orderservice.repositories;

import fv.microservice.ecommerce.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
