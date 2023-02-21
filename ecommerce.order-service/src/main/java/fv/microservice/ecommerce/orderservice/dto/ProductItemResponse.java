package fv.microservice.ecommerce.orderservice.dto;

import fv.microservice.ecommerce.orderservice.entities.Order;
import fv.microservice.ecommerce.orderservice.models.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProductItemResponse {
    private String id;
    private String productId;
    private double price;
    private int quantity;
    private double discont;
    private Product product;
    private Order order;
}
