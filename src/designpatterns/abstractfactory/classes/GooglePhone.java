package designpatterns.abstractfactory.classes;

import designpatterns.abstractfactory.interfaces.Phone;

public class GooglePhone implements Phone {
    public void display() {
        System.out.println("Google Pixel 2");
    }
}
