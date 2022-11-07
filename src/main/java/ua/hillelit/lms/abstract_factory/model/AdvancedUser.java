package ua.hillelit.lms.abstract_factory.model;

import java.time.LocalDateTime;

/**
 * @author Kostiantyn Kvartyrmeister 07.11.2022 User that has premium account
 */
public class AdvancedUser extends User {

  private LocalDateTime premiumTrial;

  public AdvancedUser(String nickName, LocalDateTime premiumTrial) {
    super(nickName, true);
    this.premiumTrial = premiumTrial;
  }

  public LocalDateTime getPremiumTrial() {
    return premiumTrial;
  }

  public void setPremiumTrial(LocalDateTime premiumTrial) {
    this.premiumTrial = premiumTrial;
  }
}
