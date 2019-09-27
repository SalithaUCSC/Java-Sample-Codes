package designpatterns.abstractfactory.interfaces;

import designpatterns.abstractfactory.types.ManufacturerType;

public interface OSFactory {
    Phone create(ManufacturerType manufacturerType);
}
