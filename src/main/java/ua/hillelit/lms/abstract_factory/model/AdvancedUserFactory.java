package ua.hillelit.lms.abstract_factory.model;

import java.time.LocalDateTime;
import ua.hillelit.lms.abstract_factory.api.UsersFactory;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022 Factory of advanced users (default params nickName =
 * "Advanced User" , premiun trial - now, all can be setted)
 */
public class AdvancedUserFactory implements UsersFactory {

  public AdvancedUserFactory() {
    //Just empty constructor to create object
  }

  public User getUser() {
    return new AdvancedUser("Advanced User", LocalDateTime.now());
  }
}
