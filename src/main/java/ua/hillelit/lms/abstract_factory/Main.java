package ua.hillelit.lms.abstract_factory;

import ua.hillelit.lms.abstract_factory.model.AdvancedUserFactory;
import ua.hillelit.lms.abstract_factory.model.DefaultUserFactory;
import ua.hillelit.lms.abstract_factory.model.User;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022
 */
public class Main {

  public static void main(String[] args) {
    AdvancedUserFactory advancedUserFactory = new AdvancedUserFactory();
    DefaultUserFactory defaultUserFactory = new DefaultUserFactory();
    User user = advancedUserFactory.getUser();
    User user1 = defaultUserFactory.getUser();

    System.out.println(user.getNickName());
    System.out.println(user1.getNickName());
  }
}
