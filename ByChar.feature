Feature:  By char


  @RunThis
 Scenario: validating by char feature

   When user creates sequence from excel {string} and sheet {string}



  Scenario: validating by char in run sequence
   Then user enters actions for sequence01


  Scenario: validating by char in run sequence with carry forward
    Then user enters actions for sequence02 with carry forward

  Scenario: validating by char in run sequence with carry forward by characteristics
    Then user enters actions for sequence03 with carry forward by characteristics

  Scenario: validating by char in run sequence for chained sequence
    Then user enters actions for sequence04 for chained sequence


  Scenario: validating by char in run sequence for para value to match
    Then user enters actions for sequence05 for para value to match


    Scenario: Validating by char

      When  user creates parts for bychar02
