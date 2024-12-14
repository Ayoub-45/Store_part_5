package org.example;

import java.util.List;

public class VegetableCriterion implements Criterion {
    private ProductVegetable vegetable;

    public VegetableCriterion(ProductVegetable vegetable) {
        this.vegetable = vegetable;
    }

    @Override
    public boolean isFresh(String season) {
        // Assume months are represented as their full names for simplicity
        List<String> monthOrder = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        int harvestIndex = monthOrder.indexOf(vegetable.getHarvestSeason());
        int seasonIndex = monthOrder.indexOf(season);
        return seasonIndex != -1 && harvestIndex != -1 && (seasonIndex - harvestIndex <= 1);
    }
}
