package com.studbaza.shop.controllers;

import com.studbaza.shop.domain.Product;
import com.studbaza.shop.domain.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class ContentController {

    @Autowired
    ProductRepository productRepository;

    private static Logger log = Logger.getLogger(ProductController.class.getName());


}