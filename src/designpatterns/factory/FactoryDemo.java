package designpatterns.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("CAR");
        car.park();
        Vehicle van = VehicleFactory.getVehicle("VAN");
        van.park();
    }
}
