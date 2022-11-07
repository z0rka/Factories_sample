package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * TV class that extends Device
 */
public class TV extends Device {

  private String matrix;

  public TV(String name) {
    super(name);
  }

  public String getMatrix() {
    return matrix;
  }

  public void setMatrix(String matrix) {
    this.matrix = matrix;
  }
}
