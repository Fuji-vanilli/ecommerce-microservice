package fv.microservice.ecommerce.inventoryservice.service;

import fv.microservice.ecommerce.inventoryservice.dto.ProductRequest;
import fv.microservice.ecommerce.inventoryservice.dto.ProductResponse;
import fv.microservice.ecommerce.inventoryservice.mapper.ProductMapper;
import fv.microservice.ecommerce.inventoryservice.model.Product;
import fv.microservice.ecommerce.inventoryservice.repositorie.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class ProductService implements IProductService{

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
        Product product= productMapper.productRequestToProduct(productRequest);

        product.setId(UUID.randomUUID().toString());

        return productMapper.productToProductResponse(
                productRepository.save(product)
        );
    }

    @Override
    public ProductResponse getById(String id) {
        return productMapper.productToProductResponse(
                productRepository.findById(id).get()
        );
    }

    @Override
    public List<ProductResponse> all() {
        return productRepository.findAll()
                .stream()
                .map(product -> productMapper.productToProductResponse(product))
                .collect(Collectors.toList());
    }
}
