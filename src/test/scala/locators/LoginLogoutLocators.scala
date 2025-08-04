package locators

import org.openqa.selenium.By

object LoginLogoutLocators {

  val usernameField: By = By.name("username")
  val passwordField: By = By.name("password")
  val submitButton: By = By.cssSelector("input[type='submit']")

}
