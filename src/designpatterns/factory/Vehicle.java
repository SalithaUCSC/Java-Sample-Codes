package designpatterns.factory;

public abstract class Vehicle {

    String name;

    public abstract void park();

    public String getName(){
        return name;
    }
}
