package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.Category;
import com.example.EcommerceAPI.model.Product;
import com.example.EcommerceAPI.model.User;
import com.example.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    //    Task -- 1 -- Create Products --> Crud Repository (CR) method
    @PostMapping("products")
    public String addProducts(@RequestBody Product product) {
        return productService.addProducts(product);
    }


    //    Task -- 2 -> Get All Products Based on Category //GET // I will get user by Custom Query(CQ)
    @GetMapping("products/productCategory")
    public List<Product> getAllProductsByCategory(@RequestParam Category category) {
        return productService.getAllProductsByCategory(category);
    }

    //    Task -- 3 --> Delete Products By Product_Id // DELETE --> i will use Custom Query(CQ)  used here
    @DeleteMapping("products/productId/{productId}")
    public String deleteById(@PathVariable Integer productId) {
        return productService.deleteById(productId);
    }
}