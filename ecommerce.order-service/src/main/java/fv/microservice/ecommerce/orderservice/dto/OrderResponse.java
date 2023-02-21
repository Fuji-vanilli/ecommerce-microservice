package fv.microservice.ecommerce.orderservice.dto;

import fv.microservice.ecommerce.orderservice.entities.ProductItem;
import fv.microservice.ecommerce.orderservice.enums.OrderStatus;
import fv.microservice.ecommerce.orderservice.models.Customer;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class OrderResponse {
    private String id;
    private Date dateCreation;
    private OrderStatus status;
    private String customerId;
    private Customer customer;
    private List<ProductItem> productItems;
}
