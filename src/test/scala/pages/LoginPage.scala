package pages

import locators.LoginLogoutLocators.{passwordField, submitButton, usernameField}
import testdata.Data.{passwordText, usernameText}

object LoginPage extends BasePage {

  def navLoginPage(): Unit = {
    driver.get("https://parabank.parasoft.com/parabank/index.htm")
    println("on login page")
  }

  def enterUsername(): Unit = {
    driver.findElement(usernameField).sendKeys(usernameText)
    println("username entered")
  }

  def enterPassword(): Unit = {
    driver.findElement(passwordField).sendKeys(passwordText)
    println("password entered")
  }

  def clickLogin(): Unit = {
    driver.findElement(submitButton).click()
    println("login clicked")
  }

}
