package com.example.store.controller;

import com.example.store.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BucketController {

    private final BucketService bucketService;

    @Autowired
    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("ID") Integer... args) {
        bucketService.addItems(args);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return bucketService.getItems();
    }
}
