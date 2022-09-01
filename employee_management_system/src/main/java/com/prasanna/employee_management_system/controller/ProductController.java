package com.prasanna.employee_management_system.controller;


import com.prasanna.employee_management_system.model.Product;
import com.prasanna.employee_management_system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/getall")

    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
