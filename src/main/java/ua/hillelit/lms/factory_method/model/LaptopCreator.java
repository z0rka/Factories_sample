package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * Creator of laptops
 */
public class LaptopCreator extends DevicesCreator {

  public LaptopCreator() {
    //Just empty method top create object
  }

  @Override
  public Device factoryMethod() {
    return new Laptop("Laptop");
  }
}
