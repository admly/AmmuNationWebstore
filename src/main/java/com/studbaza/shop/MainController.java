package com.studbaza.shop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@RestController

public class MainController {
    @RequestMapping("/api")
    public ResponseEntity<List<String>> getList() {
        List<String> list = new ArrayList<>();
        list.add("kek 2");
        return ResponseEntity.ok(list);
    }
}
