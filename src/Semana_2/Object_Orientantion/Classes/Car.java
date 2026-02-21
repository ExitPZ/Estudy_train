package Semana_2.Object_Orientantion.Classes;

public class Car {
    public String model;
    public int speed;
    public int year;

    //Constructor
    public Car(String model, int year) {
        this.model = model;
        this.speed = 0;
        this.year = year;
    }

    //Methods
    public void accelerate(int valor) {
        speed += valor;
        System.out.println(model + " is accelerating. Current speed: " + speed + " km/h");
    }

    public void brake(int valor) {
        speed -= valor;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(model + " is braking. Current speed: " + speed + " km/h");
    }

    public void showSpeed() {
        System.out.println(speed + " km/h");
    }


}
