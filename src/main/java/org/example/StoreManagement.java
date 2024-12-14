package org.example;

public class StoreManagement {
    public static void main(String[] args) {
        // Create Store
        Store store = new Store();

        // Create Products
        Product p1 = new ProductFruit(1254, "Strawberry", 12.3f, "March");
        Product p2 = new ProductFruit(1224, "Watermelon", 50f, "June");
        Product p3 = new ProductFruit(7896, "Mandarin", 25.6f, "December");
        Product p4 = new ProductVegetable(8521, "Artichokes", 14f, "January");

        // Add Products to Store
        store.add(p1);
        store.add(p2);
        store.add(p3);
        store.add(p4);

        // List Products
        System.out.println("Products in the store:");
        store.listProducts();

        // Calculate Stock of Fruits
        System.out.println("Total stock of fruits: " + store.calculateStock());

        // Freshness Check
        FruitCriterion fruitCriterion = new FruitCriterion((ProductFruit) p1);
        VegetableCriterion vegetableCriterion = new VegetableCriterion((ProductVegetable) p4);

        System.out.println("Is Strawberry fresh in March? " + fruitCriterion.isFresh("March"));
        System.out.println("Is Artichokes fresh in February? " + vegetableCriterion.isFresh("February"));
    }
}
