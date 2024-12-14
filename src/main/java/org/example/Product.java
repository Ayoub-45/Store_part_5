package org.example;

public abstract class Product {
    private long  Id;
    private String type;
    private String label;
    private float quantity;
    public Product (long Id,String label,float quantity) {
        this.Id = Id;
        this.type = type;
        this.label = label;
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public long getId() {
        return Id;
    }

    public String getLabel() {
        return label;
    }
    public void setId(long Id) {
        this.Id = Id;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
    public abstract String determineProductType();
}

