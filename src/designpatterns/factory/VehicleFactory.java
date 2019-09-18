package designpatterns.factory;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType){
        switch (vehicleType){
            case "CAR":
                return new Car();
            case "VAN":
                return new Van();
            default:
                return null;
        }
    }
}
