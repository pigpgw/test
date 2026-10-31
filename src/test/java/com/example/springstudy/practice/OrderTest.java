package com.example.springstudy.practice;

import org.junit.jupiter.api.Test;

import com.example.springstudy.practice.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    void calculateTotalPrice_returnsProductTotalPrice() {
        Product product = new Product("프로덕트", 1000, 10);
        Order order = new Order(product);
        assertEquals(order.calculateTotalPrice(), 10000);
    }
}
