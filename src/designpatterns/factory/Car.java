package designpatterns.factory;

public class Car extends Vehicle {
    @Override
    public void park() {
        name = "CAR";
        System.out.println(name);
    }
}
