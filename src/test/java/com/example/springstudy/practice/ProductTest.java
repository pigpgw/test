package com.example.springstudy.practice;

import com.example.springstudy.practice.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {
    @Test
    void generateProduct() {
        Product product1 = new Product("노트1", 2000, 2);
        Product product2 = new Product("노트2", 3000, 2);
        Product product3 = new Product("노트3", 4000, 2);

        assertEquals("노트1", product1.getName());
        assertEquals("노트2", product2.getName());
        assertEquals("노트3", product3.getName());
    }

    @Test
    void calculatePrice() {
        Product product = new Product("노트", 1000, 10);
        assertEquals(product.calculatePrice(), 10000);
    }

    @Test
    void calculateWrongPrice() {
        assertThrows(IllegalArgumentException.class, () -> new Product("노트1", -1000, 1));
        assertThrows(IllegalArgumentException.class, () -> new Product("노트2", 1000, 0));
        assertThrows(IllegalArgumentException.class, () -> new Product("노트3", 2000, -2));
    }
}
