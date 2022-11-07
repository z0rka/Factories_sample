package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * Abstract device creator for factory method
 */
public abstract class DevicesCreator  {

  protected DevicesCreator() {
  }

  public abstract Device factoryMethod();
}
