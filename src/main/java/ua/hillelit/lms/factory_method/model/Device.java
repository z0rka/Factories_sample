package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * Abstact class of device
 */
public abstract class Device {

  private String name;
  private String price;

  protected Device(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


}
