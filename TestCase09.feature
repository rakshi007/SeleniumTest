
@tag
Feature: Testing No  


  Scenario: Validating No  report 

  
# Adding a Characteristic
Given the user is on the home page
When the user clicks on the Add Icon to start the process
Then the user clicks on the Add Characteristic link to open the form
Then the user expands the Data Group Name dropdown to view the list of data groups
Then the user selects the desired data group from the dropdown
Then the user opens the Part dropdown to view the list of available parts
Then the user selects the appropriate part from the dropdown
Then the user enters the Characteristic Name in the respective input field
Then the user clicks the Add button to confirm the characteristic details
And the user inputs the Upper Spec value in the corresponding input field
And the user enters the Lower Spec value in the respective input field
Then the user specifies the Subgroup Size to define grouping
Then the user clicks the Save button
Then the user clicks on controlchart preferences 
Then user clikcs on calculation tab
Then user change Control Limit calculation after value
Then user clicks on save button to save chart preferences
Then the user clicks the Close button to exit charoverview

# Creating Parameters allow users to add list
Given the user navigates to Settings by clicking the Configuration option
When the user initiates the parameter creation process by clicking on the Add Parameter
Then the user enters a name in the Parameter Name input field
Then the user clicks on the allow user to add list check box

Then the user enters parameter entry field01
Then the user clicks on add icon01

Then the user enters parameter entry field02
Then the user clicks on add icon02

Then the user enters parameter entry field03
Then the user clicks on add icon03


And the user saves the parameter configuration by clicking the Save button
Then the user finalizes the process by clicking the Close button

# Creating Parameters order by list created34

When the user starts the parameter creation process by selecting Add Parameter
Then the user provides a name in the Parameter Name input field
And the user enables the Order By List Created checkbox



Then the user enters parameter entry field01 for order by list
Then the user clicks on add icon01 for order by list

Then the user enters parameter entry field02 for order by list
Then the user clicks on add icon02 for order by list

Then the user enters parameter entry field03 for order by list
Then the user clicks on add icon03 for order by list
And the user save the parameter configuration by clicking the Save button
Then the user finalize the process by clicking the Close button



# Assigning Parameters to Parts
Given the user is on the home page
Then the user clicks on the Files icon to initiate the process of adding a parameter to the part
Then the user clicks on the Add icon to start the parameter addition process
Then the user verifies the assignment by clicking on the Assign Parameter to Part link
Then the user clicks on the Group dropdown to view the available groups
Then the user select the data group from the dropdown to specify the group
Then the user clicks on the Part dropdown to view the available parts
Then the user select the part to which the parameter will be added
And the user drags and drops the previously used parameters into the part
Then the user drags and drop the required parameter into the part
Then the user confirms the addition of the parameter by clicking on the Save button
Then the user exits the parameter addition process by clicking the Close button

# Editing a Sequence
Given the user is on the home page
Then the user clicks on the Files button to navigate to the sequence section
Then the user clicks on the expand button next to the Files icon to reveal more options
Then the user selects a group name from the grid by clicking on it
Then the user clicks on the arrow icon to expand the available options
Then the user clicks on the Sequence link to open the sequence configuration page
Then the user right-clicks on the sequence name to access additional options
Then the user selects Edit Sequence by clicking on it
Then the user rearranges the characteristics by dragging and dropping them into the desired order
Then the user saves the change by clicking the Save button
Then the user closes the sequence configuration by clicking the Close button  