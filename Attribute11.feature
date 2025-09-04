Feature: adding check sheet char to validate

  Scenario: validating check sheet matrix

  When user creates char for checksheet with enble checkbox
    When user updates sequence for checksheet with enble checkbox
    Then user creates char for checksheet without enble chcekbox
    When user updates sequence for checksheet without enble checkbox


