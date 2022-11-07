package ua.hillelit.lms.abstract_factory.model;

import ua.hillelit.lms.abstract_factory.api.UsersFactory;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022 Factory of Default users (default params nickName =
 * "Default User" can be setted)
 */
public class DefaultUserFactory implements UsersFactory {

  public DefaultUserFactory() {
    //Just empty constructor to create object
  }

  public User getUser() {
    return new DefaultUser("Default user");
  }
}
