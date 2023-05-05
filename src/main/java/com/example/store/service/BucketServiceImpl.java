package com.example.store.service;

import com.example.store.model.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketServiceImpl implements BucketService {

    private final Bucket bucket;

    @Autowired
    public BucketServiceImpl(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void addItems(Integer... args) {
        bucket.addItems(args);
    }

    @Override
    public List<Integer> getItems() {
        return bucket.getItems();
    }
}
