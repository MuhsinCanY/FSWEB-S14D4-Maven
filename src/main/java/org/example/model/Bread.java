package org.example.model;

public class Bread extends ProductForSale {

    private boolean isHot;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, boolean isHot) {
        super(type, price, description);
        this.isHot = isHot;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread{" +
                "isHot=" + isHot +
                '}');
    }

}
