package br.com.arfrisselli.factory;

public abstract class Car {

    private int horsepower;
    private String fuelSource;
    private String color;

    public Car(int horsepower, String fuelSource, String color) {
        this.horsepower = horsepower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("Starting engine");
        System.out.println("The " + fuelSource + " engine is up and running and the car is ready to go! " + horsepower);
    }

    public void clean() {
        System.out.println("Cleaning the car");
        System.out.println("The car is clean and " + color + " color shines");
    }

    public void mechanicCheck() {
        System.out.println("Checking the car");
        System.out.println("The car has been checked by the mechanic and looks good to go! " + horsepower);
    }

    public void fuelCar() {
        System.out.println("Fueling the car");
        System.out.println("The car has been filled with " + fuelSource.toLowerCase());
    }
}
