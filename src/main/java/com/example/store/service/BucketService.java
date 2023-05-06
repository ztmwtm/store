package com.example.store.service;

import java.util.List;

public interface BucketService {
    void addItems(Integer... args);

    List<Integer> getItems();
}
