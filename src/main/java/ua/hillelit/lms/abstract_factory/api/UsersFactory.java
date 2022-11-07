package ua.hillelit.lms.abstract_factory.api;

import ua.hillelit.lms.abstract_factory.model.User;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022 Factory of users that has method
 * {@link UsersFactory#getUser()}
 */
public interface UsersFactory {

  User getUser();
}
