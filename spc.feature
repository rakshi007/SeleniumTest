Feature: User Login

  Scenario: verifying login with valid credentilas
    Given when user is on login page
    When user enters username "superuser"
    And users enters password "DLisgreat"
    And user click on login button
