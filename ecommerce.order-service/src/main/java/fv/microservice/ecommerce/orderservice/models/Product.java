package fv.microservice.ecommerce.orderservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Product {
    private String id;
    private String designation;
    private double price;
    private int quantity;

}
