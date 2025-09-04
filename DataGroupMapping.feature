Feature: Satellite Mapping


  Scenario Outline: Login as user and verify satellites
    Given user "<username>" logs in and verifies assigned satellites

    Examples:
      | username  |
      | username1 |
      | username2 |
