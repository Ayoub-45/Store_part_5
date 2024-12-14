package org.example;

import java.util.ArrayList;
import java.util.List;

class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void add(Product p) {
        products.add(p);
    }

    public void listProducts() {
        for (Product p : products) {
            System.out.println(p.getId() + " - " + p.getLabel() + " - " + p.determineProductType());
        }
    }

    public float calculateStock() {
        float total = 0;
        for (Product p : products) {
            if (p instanceof ProductFruit) {
                total += p.getQuantity();
            }
        }
        return total;
    }
}


