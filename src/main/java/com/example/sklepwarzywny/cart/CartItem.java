package com.example.sklepwarzywny.cart;

import com.example.sklepwarzywny.products.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CartItem {

    @Getter
    @Setter
    private int count;

    @Getter
    @Setter
    private Product product;

}
