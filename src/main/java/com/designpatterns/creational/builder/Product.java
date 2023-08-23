package com.designpatterns.creational.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private final List<String> parts;
    public Product() {
        parts = new LinkedList<>();
    }
    public void add(String part) {
        parts.add(part);
    }
    public String show() {
        StringBuilder result = new StringBuilder();
        result.append("Product components are :");
        result.append("\n");

        for(String part : parts) {
            result.append(part);
            result.append("\n");
        }

        return result.toString();
    }
}
