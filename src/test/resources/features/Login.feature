@login

  Feature: Login Functionality

    Scenario: Successful login with valid credentials
      Given the user is on the login page
      When the user enters valid username and password
      And the user clicks the login button
      Then the user is redirected to the account overview page