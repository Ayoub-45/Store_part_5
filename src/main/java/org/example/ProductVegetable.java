package org.example;

class ProductVegetable extends Product {
    private String harvestSeason;

    public ProductVegetable(long id, String label, float quantity, String harvestSeason) {
        super(id, label, quantity);
        this.harvestSeason = harvestSeason;
    }

    public String getHarvestSeason() {
        return harvestSeason;
    }

    @Override
    public String determineProductType() {
        return "Vegetable";
    }
}
