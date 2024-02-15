package com.learn.streamapi;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Product(String name, String category) {}

public class GroupingBy {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics"),
                new Product("Phone", "Electronics"),
                new Product("Shirt", "Clothing"),
                new Product("Watch", "Accessories"),
                new Product("Sunglasses", "Accessories"),
                new Product("Trousers", "Clothing")
        );
//        Map<String, List<Product>> productsByCategory = products.stream()
//                .collect(Collectors.groupingBy(product -> product.category()));

        Map<String, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(product -> product.category()));//passing classifier function
        productsByCategory.forEach((String category, List<Product> productList) -> {
            System.out.println("Category: " + category);
            System.out.println("Products: " + productList);
            System.out.println();
        });
    }
}
