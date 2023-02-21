package fv.microservice.ecommerce.inventoryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProductResponse {
    private String id;
    private String designation;
    private double price;
    private int quantity;
}
