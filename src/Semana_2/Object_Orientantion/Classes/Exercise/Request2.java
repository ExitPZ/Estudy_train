package Semana_2.Object_Orientantion.Classes.Exercise;

public class Request2 {
    private int quantity;
    private Product2 product;
    private int numRquest;

    public Request2(Product2 product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.numRquest = (int) (Math.random() * 1000); // Gerar um número aleatório para o pedido
    }

    public double totalPrice() {
        return product.price * quantity;
    }

    public void showResume() {
        System.out.println("Request Number: " + numRquest);
        System.out.println("Product: " + product.name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice());
    }

}
