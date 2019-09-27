package designpatterns.abstractfactory;

import designpatterns.abstractfactory.factories.AndroidFactory;
import designpatterns.abstractfactory.factories.WindowsFactory;
import designpatterns.abstractfactory.interfaces.OSFactory;
import designpatterns.abstractfactory.types.OSType;

public abstract class AbstractPhoneFactory {
    public static OSFactory getFactory(OSType osType) {
        switch (osType) {
            case ANDROID:
                return new AndroidFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                return null;
        }
    }
}
