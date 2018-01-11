package com.studbaza.shop;

import com.studbaza.shop.domain.Product;
import com.studbaza.shop.domain.ProductRepository;
import com.studbaza.shop.service.ProductService;
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

    @Autowired
    ProductService productService;

    private static Logger log = Logger.getLogger(ProductController.class.getName());

    ///getSingleProduct/product?id=...
    @RequestMapping("/getSingleProduct/product")
    public ResponseEntity<Product> getSingleProduct(@RequestParam("id") String productId){
        return ResponseEntity.ok(productRepository.findOne(productId));
    }

    @RequestMapping("/getAllProducts/products")
    public ResponseEntity<Iterable<Product>> getAllProducts(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    @RequestMapping("/{category}")
    public ResponseEntity<Iterable<Product>> getProductsByCategory(@PathVariable("category") String productCategory) {
        List<Product> products = productService.getProductsByCategory(productCategory);
        if (products == null || products.isEmpty()) {
            log.info("Error while handling category request");
        }
        return ResponseEntity.ok(productService.getProductsByCategory(productCategory));
    }
}
