package com.example.sklepwarzywny.products;

import java.util.Objects;

public class ProductDto {


    private final Long id;
    private final String name;
    private final Double price;
    private Integer count;


    public ProductDto(Long id, String name, Double price, Integer count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
    public Integer getCount() { return  this.count; }
    public Integer setCount() { return  this.count; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price,count);
    }
}
