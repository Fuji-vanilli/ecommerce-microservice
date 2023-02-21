package fv.microservice.ecommerce.orderservice.entities;

import fv.microservice.ecommerce.orderservice.models.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class ProductItem {
    @Id
    private String id;
    private String productId;
    private double price;
    private int quantity;
    private double discont;
    @Transient
    private Product product;
    @ManyToOne
    private Order order;
}
