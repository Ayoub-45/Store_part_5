package org.example;

public class ProductFruit extends Product {
    private String harvestSeason;
    public ProductFruit(long Id, String label,float quantity,String harvestSeason) {
        super(Id,label,quantity);
        this.harvestSeason = harvestSeason;
    }
    public String getHarvestSeason() {
        return harvestSeason;
    }
    @Override
    public String determineProductType(){
        return "Fruit";
    }

}
