Feature: Adding data group

Scenario: Verifying datagroup


When the user clicks on the add link  
  And the user clicks on add data group  
  And the user enters a unique data group name  
  Then the user clicks on the add button  
  And the data group should be created successfully 
