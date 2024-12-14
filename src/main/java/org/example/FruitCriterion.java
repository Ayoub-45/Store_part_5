package org.example;

public class FruitCriterion implements Criterion {
    private ProductFruit fruit;
    public FruitCriterion(ProductFruit fruit){
        this.fruit = fruit;
    }
    @Override
    public boolean isFresh(String season){
        return fruit.getHarvestSeason().equalsIgnoreCase(season);
    }
}
