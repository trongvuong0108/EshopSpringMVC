package com.code.Controllers;

import com.code.Entities.Category;
import com.code.Entities.Product;
import com.code.Service.CategoryService;
import com.code.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String home(ModelMap modelMap){
        List<Product> productList = productService.getAllProduct();
        List<Category> categoryList = categoryService.getAllCategory();
        modelMap.addAttribute("Products",productList);
        modelMap.addAttribute("Categories",categoryList);
        return "HomePage";
    }
}
