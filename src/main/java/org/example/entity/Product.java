package org.example.entity;

import java.lang.reflect.Field;
import java.util.Objects;

public class Product {

    private String id;
    private String name;
    private Double price;


    public Product(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.validation();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


    private void validation() {
        validateID();
        validateName();
        validatePrice();

    }

    private void validateID() {
        if (this.id.isEmpty()) {
            throw new NullPointerException("Id nao pode ser nulo");
        }
    }

    private void validateName() {
        if (this.name.isEmpty()) {
            throw new NullPointerException("nome nao pode ser nulo ou vazio");
        }
    }

    private void validatePrice() {
        if (this.price <= 0) {
            throw new IllegalArgumentException("O valor nao pode ser menor ou igual a zero");
        }
    }


}
