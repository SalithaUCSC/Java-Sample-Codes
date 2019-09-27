package designpatterns.abstractfactory.classes;

import designpatterns.abstractfactory.interfaces.Phone;

public class HuaweiPhone implements Phone {
    public void display() {
        System.out.println("Huawei GR 5");
    }
}
