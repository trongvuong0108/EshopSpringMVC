package com.code.Controllers;

import com.code.Entities.Product;
import com.code.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/")
    public String home(ModelMap modelMap){
        List<Product> productList = productService.getAllProduct();
        modelMap.addAttribute("Products",productList);
        return "HomePage";
    }
}
