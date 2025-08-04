package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.LoginPage.{clickLogin, enterPassword, enterUsername, navLoginPage}

class LoginSteps extends ScalaDsl with EN {

  Given("""the user is on the login page""") { () =>
    navLoginPage()
  }

  When("""the user enters valid username and password""") { () =>
    enterUsername()
    enterPassword()
  }

  And("""the user clicks the login button""") { () =>
    clickLogin()
  }

}