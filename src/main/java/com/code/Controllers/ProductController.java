package com.code.Controllers;

import com.code.Entities.Product;
import com.code.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String listProduct(ModelMap modelMap){
        List<Product> products = productService.getAllProduct();
        modelMap.addAttribute("productList",products);
        return "productManagerment";
    }

    @RequestMapping("/create")
    public String save(Map<String, Object> model) {
        Product product = new Product();
        model.put("product", product);
        return "createProduct";
    }

    @PostMapping("/save")
    public String createProduct(@ModelAttribute("product") Product product){
        productService.createProduct(product);
        return "redirect:/";
    }

}
