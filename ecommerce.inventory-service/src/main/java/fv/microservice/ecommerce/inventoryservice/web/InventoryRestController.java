package fv.microservice.ecommerce.inventoryservice.web;

import fv.microservice.ecommerce.inventoryservice.dto.ProductRequest;
import fv.microservice.ecommerce.inventoryservice.dto.ProductResponse;
import fv.microservice.ecommerce.inventoryservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/inventory")
@RefreshScope
@RequiredArgsConstructor
public class InventoryRestController implements ProductApi{

    private final ProductService productService;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
        return productService.create(productRequest);
    }

    @Override
    public ProductResponse getById(String productId) {
        return productService.getById(productId);
    }

    @Override
    public List<ProductResponse> all() {
        return productService.all();
    }
}
