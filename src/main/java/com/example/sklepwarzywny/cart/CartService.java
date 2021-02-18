package com.example.sklepwarzywny.cart;

import com.example.sklepwarzywny.products.Product;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class CartService {

    private List<Product> itemsList = new ArrayList<>();
    private Map<Long, Product> products = new HashMap<>();

    public List<Product> addToCart(Product product) {
        Product pp = product;
        if (products.containsKey(product.getId())) {
            pp = products.get(product.getId());
            pp.setCount(pp.getCount() + 1);
        }
//        products.getOrDefault(product.getId(),pp).setCount(pp.getCount() + 1);
//        products.compute(product.getId(), )
        products.put(product.getId(), pp);
        return new ArrayList<>(products.values());
//dodanie do bazy, czemu wywala jak domyslne count,
    }

    public List<Product> removeFromCart(Product product) {
        if (products.containsKey(product.getId()))  {
            Product pp = products.get(product.getId());
            if (pp.getCount() > 1) {
                pp.setCount(pp.getCount() - 1);
                products.put(product.getId(), pp);
            } else {
                products.remove(product.getId());
            }
        }
        return new ArrayList<>(products.values());

    }

    public List<Product> getCartState() {
        return new ArrayList<>(products.values());
    }

// sumowanie koszyka

public double countCart() {
    AtomicReference<Double> sum = new AtomicReference<>(0.0);
        products.forEach((id, product2) -> sum.updateAndGet(v -> v + product2.getPrice()));
        return countCart();
                }


}


