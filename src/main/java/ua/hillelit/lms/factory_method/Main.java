package ua.hillelit.lms.factory_method;

import ua.hillelit.lms.factory_method.model.Device;
import ua.hillelit.lms.factory_method.model.DevicesCreator;
import ua.hillelit.lms.factory_method.model.LaptopCreator;
import ua.hillelit.lms.factory_method.model.PhoneCreator;
import ua.hillelit.lms.factory_method.model.TVCreator;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 */
public class Main {

  public static void main(String[] args) {
    DevicesCreator[] creator = {new TVCreator(),new LaptopCreator(), new PhoneCreator()};

    for (DevicesCreator devicesCreator : creator) {
      Device device = devicesCreator.factoryMethod();
      System.out.println(device.getName());
    }
  }
}
