package com.code.Service;

import com.code.Entities.Product;
import com.code.Models.ProductModel;
import com.code.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ProductServiceIMPL implements ProductService {
    @Autowired
    private ProductRepository productRepository ;

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
