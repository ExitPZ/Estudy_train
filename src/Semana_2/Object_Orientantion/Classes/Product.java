package Semana_2.Object_Orientantion.Classes;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getNome() {
        return name;
    }

    public double getPreco() {
        return price;
    }


}
