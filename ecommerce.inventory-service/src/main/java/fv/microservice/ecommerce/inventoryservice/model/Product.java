package fv.microservice.ecommerce.inventoryservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String designation;
    private double price;
    private int quantity;
}
