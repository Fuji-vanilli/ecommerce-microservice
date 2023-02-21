package fv.microservice.ecommerce.orderservice.entities;

import fv.microservice.ecommerce.orderservice.enums.OrderStatus;
import fv.microservice.ecommerce.orderservice.models.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Table(name = "order_table")
public class Order {
    @Id
    private String id;
    private Date dateCreation;
    private OrderStatus status;
    private String customerId;
    @Transient
    private Customer customer;
    @OneToMany(fetch = FetchType.LAZY)
    private List<ProductItem> productItems;
}
