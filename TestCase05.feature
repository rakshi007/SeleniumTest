Feature: Testing 8 Hug Avg

Scenario: Verifying 8 Hug Avg Spc 


When The user clicks on the Add Icon to start the process.
Then The user clicks on the Add Characteristic link to open the form.
Then The user Expands the Data Group Name dropdown to view the list of data groups. 
Then The user Selects the desired data group from the dropdown.
Then The user Opens the Part dropdown to view the list of available parts.
Then The user Selects the appropriate part from the dropdown. 
Then The userEnters the Characteristic Name in the respective input field.
Then The user Clicks the Add button to confirm the characteristic details.
And The user Inputs the Upper Spec value in the corresponding input field.
And The user Provides the Lower Spec value in the respective input field.
Then the userSpecifies the Subgroup Size to define grouping.
Then the user The user clicks the Save button to save the characteristic details.  
Then the user Clicks on Control Chart Preferences to open chart configuration settings.  
Then the user Accesses the Analysis Tab to view analysis options. 
Then the user Clicks on the Define Run dropdown and selects the desired optio
Then the user Configures the trend by selecting the Define Trend Down option.
Then user click on Hugging Average dropdown and select value
Then user click on Hugging Control Limit -2 sides dropdown and select value,                                              ; 
Then the user The user clicks the Save button to save the configured chart preferences.
Then the user The user clicks the Close button to exit the configuration page.

#create parameter date and time

And the user navigates to Settings by clicking the Configuration option.
When the user initiates the parameter creation process by clicking on the Add Parameter link  
Then the user enters a name in the Parameter Name input field.
Then the user enables the functionality by selecting the Date/Time radio button.
Then the user confirms the parameter configuration by clicking the Go button.
Then the user enters the Date and Time format in the designated field.
Then the user tests the format by clicking the Test button.
And the user saves the parameter configuration by clicking the Save button.
Then the user finalizes the process by clicking the Close button.



#create parameter 

And the user initiates parameter creation by clicking the Add Parameter link.
Then the user enters the parameter name in the designated input field.
Then the user enables the parameter by selecting the Allow radio button.
Then the user saves the parameter allow all configuration by clicking the Save button .
Then the user exits the parameter configuration by clicking the Close button.

#Assign parameter 


Then the user clicks on the Files icon to initiate the process of adding a parameter to the part.
Then the user clicks on the Add icon to start the parameter addition process.
Then the user verifies the assignment by clicking on the Assign Parameter to Part link.
Then the user clicks on the Group dropdown to view the available groups.
Then the user selects the data group from the dropdown to specify the group.
Then the user clicks on the Part dropdown to view the available parts.
Then the user selects the part to which the parameter will be added.
And the user drags and drops the previously used parameters into the part.
Then the user drags and drops the required parameter into the part.
Then the user confirms the addition of the parameter by clicking on the Save button.
Then the user exits the parameter addition process by clicking the Close button.

#Editing a Sequence

Then the user clicks on the Files button to navigate to the sequence section.
Then the user clicks on the expand button next to the Files icon to reveal more options.
Then the user selects a group name from the grid by clicking on it.
Then the user clicks on the arrow icon to expand the available options.
Then the user clicks on the Sequence link to open the sequence configuration page.
Then the user right-clicks on the sequence name to access additional options.
Then the user selects Edit Sequence by clicking on it.
Then the user rearranges the characteristics by dragging and dropping them into the desired order.
Then the user saves the changes by clicking the Save button.
Then the user closes the sequence configuration by clicking the Close button.


