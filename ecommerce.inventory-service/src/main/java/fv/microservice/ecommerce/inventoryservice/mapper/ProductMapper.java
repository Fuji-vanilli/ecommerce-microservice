package fv.microservice.ecommerce.inventoryservice.mapper;

import fv.microservice.ecommerce.inventoryservice.dto.ProductRequest;
import fv.microservice.ecommerce.inventoryservice.dto.ProductResponse;
import fv.microservice.ecommerce.inventoryservice.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponse productToProductResponse(Product product);
    Product productRequestToProduct(ProductRequest productRequest);
}
