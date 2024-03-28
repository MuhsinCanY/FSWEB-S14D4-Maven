package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale p1 = new Chocolate("Dark",15,
                "So good",true);
        ProductForSale p2 = new Coke("Light",5,
                "Original taste",true);
        ProductForSale p3 = new Bread("Wheat",10,
                "150 gr",true);

        ProductForSale[] list = {p1,p2,p3};
        listProducts(list);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}