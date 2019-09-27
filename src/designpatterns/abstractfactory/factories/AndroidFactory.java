package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.classes.GooglePhone;
import designpatterns.abstractfactory.classes.HuaweiPhone;
import designpatterns.abstractfactory.classes.OnePlus5T;
import designpatterns.abstractfactory.interfaces.OSFactory;
import designpatterns.abstractfactory.interfaces.Phone;
import designpatterns.abstractfactory.types.ManufacturerType;

public class AndroidFactory implements OSFactory {
    public Phone create(ManufacturerType manufacturerType) {
        switch (manufacturerType) {
            case GOOGLE:
                return new GooglePhone();
            case ONEPLUS:
                return new OnePlus5T();
            case HUAWEI:
                return new HuaweiPhone();
            default:
                return null;
        }
    }
}
