package designpatterns.abstractfactory;

import designpatterns.abstractfactory.interfaces.OSFactory;
import designpatterns.abstractfactory.interfaces.Phone;
import designpatterns.abstractfactory.types.ManufacturerType;
import designpatterns.abstractfactory.types.OSType;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        OSFactory factory = AbstractPhoneFactory.getFactory(OSType.ANDROID);
        Phone pixelPhone = factory.create(ManufacturerType.GOOGLE);
        pixelPhone.display();

        Phone huaweiPhone = factory.create(ManufacturerType.HUAWEI);
        huaweiPhone.display();

        OSFactory wfactory = AbstractPhoneFactory.getFactory(OSType.WINDOWS);
        Phone nokiaPhone = wfactory.create(ManufacturerType.MICROSOFT);
        nokiaPhone.display();
    }
}
