package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.classes.MicrosoftPhone;
import designpatterns.abstractfactory.interfaces.OSFactory;
import designpatterns.abstractfactory.interfaces.Phone;
import designpatterns.abstractfactory.types.ManufacturerType;

public class WindowsFactory implements OSFactory {
    public Phone create(ManufacturerType manufacturerType) {
        switch (manufacturerType) {
            case MICROSOFT:
                return new MicrosoftPhone();
            default:
                return null;
        }
    }
}
