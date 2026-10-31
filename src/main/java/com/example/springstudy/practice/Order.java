package com.example.springstudy.practice;

public class Order {
    private Product product;

    Order(Product product) {
        this.product = product;
    }

    int calculateTotalPrice() {
        return this.product.calculatePrice();
    }
}
