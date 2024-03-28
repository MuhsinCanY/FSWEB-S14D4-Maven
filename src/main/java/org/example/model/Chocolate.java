package org.example.model;

public class Chocolate extends ProductForSale {

    private boolean isBitter;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price,
                     String description, boolean isBitter) {
        super(type, price, description);
        this.isBitter = isBitter;
    }

    @Override
    void showDetails() {
        System.out.println("Chocolate{" +
                "isBitter=" + isBitter +
                '}');
    }

}
