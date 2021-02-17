package com.example.sklepwarzywny.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Getter
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Double price;

    @Getter
    @Setter
    private Integer count = 1;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


}
