package com.studbaza.shop.service;

import com.studbaza.shop.domain.Product;
import com.studbaza.shop.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProductsByCategory(String category) {
        List<Product> productsByCategory = new ArrayList<>();
        for(Product product: productRepository.findAll()) {
            if(category.equalsIgnoreCase(product.getCategory())){
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }
}
