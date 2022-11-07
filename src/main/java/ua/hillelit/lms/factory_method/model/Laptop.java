package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * Laptop class that extends Device
 */
public class Laptop extends Device {

  private String cp;

  public Laptop(String name) {
    super(name);
  }

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }
}
