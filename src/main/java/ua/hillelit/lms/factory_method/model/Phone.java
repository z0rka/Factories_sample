package ua.hillelit.lms.factory_method.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 * Phone class that extends device
 */
public class Phone extends Device{

  private String camera;

  public Phone(String name) {
    super(name);
  }

  public String getCamera() {
    return camera;
  }

  public void setCamera(String camera) {
    this.camera = camera;
  }
}
