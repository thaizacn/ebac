package br.com.arfrisselli.factory;

public class CompanyCarFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Uno(800, "gasoline", "green");
            default:
                System.out.println("Gee, we don't have an evaluation for this car yet! But don't worry, we saved your request and will include it soon :)");
                return null;
        }
    }
}
