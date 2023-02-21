package fv.microservice.ecommerce.orderservice.dto;

import fv.microservice.ecommerce.orderservice.entities.ProductItem;
import fv.microservice.ecommerce.orderservice.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class OrderRequest {
    private OrderStatus status;
    private String customerId;
    private List<ProductItem> productItems;
}
