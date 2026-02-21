import Semana_2.Object_Orientantion.Classes.Product;
import Semana_2.Object_Orientantion.Classes.Request;


public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        Request request1 = new Request(product1 , 2);
        Request request2 = new Request(product2 , 3);

        request1.showResume();
        System.out.println("\n-------------------\n");
        request2.showResume();




    }
}
