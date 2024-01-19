package com.code.Services;

import com.code.Entities.Product;
import com.code.Models.ProductModel;
import com.code.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ProductService implements IProductService {
    private final ProductRepository productRepository ;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(ProductModel productModel) {
        productRepository.save(new Product(productModel));
    }

    @Override
    public Product findProductById(UUID id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void disableProduct(UUID id) {
        Product product = productRepository.findById(id).get();
        product.setEnable(false);
        productRepository.save(product);
    }

    @Override
    public void enableProduct(UUID id) {
        Product product = productRepository.findById(id).get();
        product.setEnable(true);
        productRepository.save(product);
    }
}
