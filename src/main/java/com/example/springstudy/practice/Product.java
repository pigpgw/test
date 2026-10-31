package com.example.springstudy.practice;

public class Product {
    private String name;
    private int price;
    private int count;

    Product(String name, int price, int count) {
        if (price < 0)
            throw new IllegalArgumentException("잘못된 가격 설정입니다.");
        if (count <= 0)
            throw new IllegalArgumentException("잘못된 수량 설정입니다.");
        this.name = name;
        this.price = price;
        this.count = count;
    }

    String getName() {
        return this.name;
    }

    int calculatePrice() {
        return price * count;
    }
}
