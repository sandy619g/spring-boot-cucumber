package com.tdd.model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
 private int orderId;
 private List<Product> productsList;
 private double price;
}
