package fv.microservice.ecommerce.orderservice.dto;

import fv.microservice.ecommerce.orderservice.entities.Order;
import fv.microservice.ecommerce.orderservice.models.Product;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProductItemRequest {
    private String productId;
    private double price;
    private int quantity;
    private double discont;
    private Order order;
}
