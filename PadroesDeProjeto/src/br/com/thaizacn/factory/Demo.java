package br.com.arfrisselli.factory;

public class Demo {

    public static void main(String[] args) {
        Customer customerOne = new Customer("B", false);
        Factory factory = getCarFactory(customerOne);
        Car carOne = factory.createCar(customerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getCarFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}
