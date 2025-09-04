Feature: Testing  Avg Trend Down and Up
Scenario: Testing  Avg Trend Down and Up

#Add char18

When the user initiates the addition of a characteristic by clicking the add icon  
Then the user navigates to the characteristic form by clicking the Add Characteristic link  
Then the user expands the data group name dropdown to view the available data groups  
Then the user selects a data group from the dropdown to associate it with the characteristic  
Then the user opens the part dropdown to view the available parts  
Then the user selects a part from the dropdown to link it with the characteristic  
Then the user inputs the Characteristic Name in the provided input field  
Then the user confirms the characteristic details by clicking the add button  
And the user enters the Upper Spec value in the corresponding input field  
And the user provides the Lower Spec value in the respective input field  
Then the user specifies the Subgroup Size value to define grouping  
Then the user saves the characteristic by clicking the save button  

Then the user clicks on the Cause Note icon  
Then the user clicks on the Add Cause icon  
Then the user enters the local cause in the input field  
Then the user clicks on the Save button to save the cause  
Then the user clicks on the Add Cause icon again  
Then the user enters another local cause  
Then the user clicks on the Save button to save the new cause  

Then the user clicks on the Action Note icon  
Then user click on add action button
Then the user enters the local action in the input field  
Then the user clicks on the Save button to save the action  
Then the user clicks on the Add Action icon  
Then the user enters another local action  
Then the user clicks on the Save button to save the new action  


Then the user configures chart settings by clicking on Control Chart Preferences  
Then the user accesses analysis options by clicking on the Analysis tab  
Then the user specifies run preferences by clicking on the Define Run dropdown  
Then the user configures trend settings by selecting the Define Trend Down option  
Then the user saves the chart preferences by clicking the save button  
Then the user exits the configuration page by clicking the close button  

#create parameter parameter entry resticted 8


And the user accesses settings by clicking on the Configuration option  
And the user adds a new parameter by clicking the Add Parameter link  
Then the user enters the parameter name in the designated input field  
Then the user enables the Parameter Entry Restricted option by clicking the checkbox  
Then the user inputs the minimum value in the respective field  
Then the user inputs the maximum value in the respective field  
Then the user saves the automated function parameter by clicking the save button  
Then the user exits the parameter configuration by clicking the close button  

#create parameter function 7  

When the user initiates the parameter creation process by clicking the Add Parameter link  
Then the user enters the parameter name in the Parameter Name input field  
Then the user enables function automation by selecting the function radio button  
Then the user proceeds with the parameter configuration by clicking the Go button  
Then the user selects the LSL link under variables  
And the user saves the function-automated parameter by clicking the save button  
Then the user finalizes and exits the parameter configuration by clicking the close button  

#assign para to part


Then the user clicks on the Files icon to initiate adding a parameter to the part  
Then the user clicks on the Add icon to begin the parameter addition process  
Then the user clicks on the Assign Parameter to Part link to verify the assignment  
Then the user clicks on the Group dropdown to view available groups  
Then the user selects the data group from the dropdown to specify the group  
Then the user clicks on the Part dropdown to view available parts  
Then the user selects the part to which the parameter will be added  
And the user drags and drops previously used parameters into the part  
Then the user drags and drops the required parameter into the part  
Then the user clicks on the Save button to confirm adding the parameter to the part  
Then the user clicks on the Close button to exit the parameter addition process  



#Adding sequence 10

Given the user clicks on the Files button.
When the user expands the Files menu by clicking the expand button next to the Files icon.
Then the user selects a group name from the grid by clicking on it for adding sequence
And expands the options by clicking the arrow icon.
Then the user opens the sequence by clicking the Sequence link.
And accesses additional options by right-clicking on the sequence name.
Then the user selects Edit Sequence from the context menu.
And rearranges the characteristics by dragging and dropping them.
Then the user saves the changes by clicking the Save button.
And completes the process by clicking the Close button.






