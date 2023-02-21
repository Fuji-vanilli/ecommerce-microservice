package fv.microservice.ecommerce.inventoryservice.service;

import fv.microservice.ecommerce.inventoryservice.dto.ProductRequest;
import fv.microservice.ecommerce.inventoryservice.dto.ProductResponse;

import java.util.List;

public interface IProductService {
    ProductResponse create(ProductRequest productRequest);
    ProductResponse getById(String id);
    List<ProductResponse> all();
}
