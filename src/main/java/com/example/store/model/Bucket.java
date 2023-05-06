package com.example.store.model;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
@SessionScope
public class Bucket {
    private final Set<Integer> items = new HashSet<>();

    public void addItems (Integer... item) {
        items.addAll(List.of(item));
    }

    public List<Integer> getItems () {
        return new ArrayList<>(items);
    }
}
