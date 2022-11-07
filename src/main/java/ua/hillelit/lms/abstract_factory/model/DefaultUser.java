package ua.hillelit.lms.abstract_factory.model;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022 Default user without premium
 */
public class DefaultUser extends User {

  public DefaultUser(String nickName) {
    super(nickName, false);
  }
}
