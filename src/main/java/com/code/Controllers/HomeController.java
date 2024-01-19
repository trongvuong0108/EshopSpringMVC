package com.code.Controllers;

import com.code.Entities.Category;
import com.code.Entities.Product;
import com.code.Services.CategoryService;
import com.code.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private final ProductService productService;

    private final CategoryService categoryService;

    public HomeController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @RequestMapping("/")
    public String home(ModelMap modelMap){
        List<Product> productList = productService.getAllProduct();
        List<Category> categoryList = categoryService.getAllCategory();
        modelMap.addAttribute("Products",productList);
        modelMap.addAttribute("Categories",categoryList);
        return "HomePage";
    }
}
