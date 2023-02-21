package fv.microservice.ecommerce.inventoryservice.repositorie;

import fv.microservice.ecommerce.inventoryservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
