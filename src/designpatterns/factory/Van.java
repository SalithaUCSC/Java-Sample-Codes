package designpatterns.factory;

public class Van extends Vehicle {
    @Override
    public void park() {
        name = "VAN";
        System.out.println(name);
    }
}
