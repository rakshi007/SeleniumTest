Feature: Validating No status in Satellite

  Scenario: Verifying No status in Satellite

    When user clicks on the network icon to verify No status
    Then user clicks on the page name for edit to verify No status
    Then user clicks on the edit icon to verify No status

  # Edit Chart 01
    When user clicks on the date input field to verify No status
    Then user clicks on the time1 input field to verify No status
    Then user enters subgroup size for one11 to verify No status
    Then user enters subgroup size for two12 to verify No status
    Then user clicks on the save button for chart1 to verify No status
    Then user fetches the 01 data from the page to verify No status

  # Edit Chart 02
    When user clicks on the time2 input field to verify No status
    Then user enters subgroup size for one21 to verify No status
    Then user enters subgroup size for two22 to verify No status
    And user enters a parameter value in allow user to add list01 to verify No status
    Then user fetches the validation data01 to verify No status
    Then user clicks on the save button for chart2 to verify No status
    Then user fetches the data from the page to verify No status

  # Edit Chart 03
    When user clicks on the time3 input field to verify No status
    Then user enters subgroup size for one31 to verify No status
    Then user enters subgroup size for two32 to verify No status
    Then user fetches the validation data02 to verify No status
    Then user clears the entered parameter to verify No status
    And user enters a parameter value in allow user to add list02 to verify No status
    Then user clicks on the save button for chart3 to verify No status
    Then user fetches the 03 data from the page to verify No status03

  # Edit Chart 04
    When user clicks on the time4 input field to verify No status
    Then user enters subgroup size for one41 to verify No status
    Then user enters subgroup size for two42 to verify No status
    And user verifies the added users in the dropdown list to verify No status
    Then user fetches the validation data03 to verify No status
    Then user clicks on the save button for chart4 to verify No status
    Then user fetches the data from the page to verify No status04

  # Edit Chart 05
    When user clicks on the time5 input field to verify No status
    Then user enters subgroup size for one51 to verify No status
    Then user enters subgroup size for two52 to verify No status
    And user selects order list from order by dropdown to verify No status
    Then user fetches the validation data53 to verify No status
    Then user clicks on the save button for chart5 to verify No status
    Then user fetches the 05 data from the page to verify No status
    Then user fetches the validation chart data05 to verify No status05
