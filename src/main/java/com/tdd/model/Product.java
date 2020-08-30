package com.tdd.model;

import lombok.Data;
@Data
public class Product {
    private int productId;
    private String name;
    private int quantity;
    private double price;
}
