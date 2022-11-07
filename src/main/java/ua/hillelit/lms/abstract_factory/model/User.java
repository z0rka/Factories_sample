package ua.hillelit.lms.abstract_factory.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 */
public abstract class User {

  private String nickName;
  private final boolean isPremium;

  protected User(String nickName, boolean isPremium) {
    this.nickName = nickName;
    this.isPremium = isPremium;
  }

  public String getNickName() {
    return nickName;
  }

  public boolean isPremium() {
    return isPremium;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }
}
