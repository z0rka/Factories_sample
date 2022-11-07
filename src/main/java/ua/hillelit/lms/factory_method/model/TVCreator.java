package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * creator of TV
 */
public class TVCreator extends DevicesCreator{

  public TVCreator() {
    //Constructor to create object of factory
  }

  @Override
  public Device factoryMethod() {
    return new TV("TV");
  }
}
