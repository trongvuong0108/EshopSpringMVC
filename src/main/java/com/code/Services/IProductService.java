package com.code.Services;

import com.code.Entities.Product;
import com.code.Models.ProductModel;

import java.util.List;
import java.util.UUID;

public interface IProductService {
    public List<Product> getAllProduct();
    public void createProduct(Product product);
    public void updateProduct(ProductModel productModel);
    public Product findProductById(UUID id);
    public void disableProduct(UUID id);
    public void enableProduct(UUID id);
}
