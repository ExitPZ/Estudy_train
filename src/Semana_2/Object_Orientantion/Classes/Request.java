package Semana_2.Object_Orientantion.Classes;

public class Request {
    private int quantity;
    private Product product;

    public Request(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double totalPrice(){
        return product.getPreco() * quantity;
    }

    public void showResume(){
        System.out.println("Product: " + product.getNome());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice());
    }
}
