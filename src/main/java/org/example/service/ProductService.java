package org.example.service;

import org.example.entity.Product;

import java.util.List;

public class ProductService {
    public static Double sumAllProducts(List<Product> products) {

        if (products.isEmpty()) {
            throw new RuntimeException("A lista não pode ser vazia");
        }

        return products.stream().mapToDouble(Product::getPrice).sum();
    }

}
