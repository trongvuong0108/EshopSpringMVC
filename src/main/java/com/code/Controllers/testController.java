package com.code.Controllers;

import com.code.Models.ProductModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class testController {
    @RequestMapping("/demo")
    public List<ProductModel> demo() {
        List<ProductModel> products = new ArrayList<>();
        products.add(new ProductModel("name", "description", 1.0f, 1.0f, 1.0f, "img"));
        products.add(new ProductModel("name", "description", 1.0f, 1.0f, 1.0f, "img"));
        products.add(new ProductModel("name", "description", 1.0f, 1.0f, 1.0f, "img"));
        return products;
    }
}
