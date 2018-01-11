package com.studbaza.shop.service;

import com.studbaza.shop.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductsByCategory(String category);
}
