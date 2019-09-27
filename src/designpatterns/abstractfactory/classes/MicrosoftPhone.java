package designpatterns.abstractfactory.classes;

import designpatterns.abstractfactory.interfaces.Phone;

public class MicrosoftPhone implements Phone {
    public void display() {
        System.out.println("Nokia 3");
    }
}
