package com.studbaza.shop;

import com.studbaza.shop.domain.Product;
import com.studbaza.shop.domain.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    private static Logger log = Logger.getLogger(ProductController.class.getName());

    @RequestMapping("/product")
    public ResponseEntity<Product> getSingleProduct(@RequestParam("id") String productId){
        return ResponseEntity.ok(productRepository.findOne(productId));
    }

    @RequestMapping("/products")
    public ResponseEntity<Iterable<Product>> getAllProducts(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    @RequestMapping("products/{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable("category") String productCategory) {
        return ResponseEntity.ok(productRepository.getByCategory(productCategory));
    }
}
