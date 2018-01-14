package com.studbaza.shop.controllers;

import com.studbaza.shop.domain.Product;
import com.studbaza.shop.domain.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    private static Logger log = Logger.getLogger(ProductController.class.getName());

    @RequestMapping("/product")
    public ResponseEntity<Product> getSingleProduct(@RequestParam("id") String productId){
        return ResponseEntity.ok(productRepository.findOne(productId));
    }

    @GetMapping("/products")
    public ResponseEntity<Iterable<Product>> getAllProducts(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    @RequestMapping("products/{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable("category") String productCategory) {
        return ResponseEntity.ok(productRepository.getByCategory(productCategory));
    }
}
