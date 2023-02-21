package fv.microservice.ecommerce.orderservice.mapper;

import fv.microservice.ecommerce.orderservice.dto.OrderRequest;
import fv.microservice.ecommerce.orderservice.dto.OrderResponse;
import fv.microservice.ecommerce.orderservice.dto.ProductItemRequest;
import fv.microservice.ecommerce.orderservice.dto.ProductItemResponse;
import fv.microservice.ecommerce.orderservice.entities.Order;
import fv.microservice.ecommerce.orderservice.entities.ProductItem;
import fv.microservice.ecommerce.orderservice.models.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderResponse orderToOrderResponse(Order order);
    Order orderRequestToOrder(OrderRequest orderRequest);
    ProductItemResponse productItemToProductItemResponse(Product product);
    ProductItem productItemRequestToProductItem(ProductItemRequest productItemRequest);
}
