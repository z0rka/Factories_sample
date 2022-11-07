package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * Creator of phones
 */
public class PhoneCreator extends DevicesCreator {

  public PhoneCreator() {
    //Constructor to create object of factory
  }

  @Override
  public Device factoryMethod() {
    return new Phone("Phone");
  }
}
