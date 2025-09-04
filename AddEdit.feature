Feature: Login with different users and perform note actions

  @NoAutoLogin
  Scenario Outline: Login as different users and perform note actions
    Given user logs in with username "<username>" and password "<password>"
    And user performs "<action>" for Subgroupdata01
    And user performs "<action>" for Subgroupdata02
    And user performs "<action>" for Subgroupdata03

    Examples:
      | username  | password   | action    |
      | username1  | password1  | add note  |
      | username2  | password2  | edit note |
