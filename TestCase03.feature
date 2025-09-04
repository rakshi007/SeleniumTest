
@reg
Feature: Average trend up
 @reg
  Scenario: Verifying  Average trend up  
  
When user clicks on the add icon to initiate adding a characteristic
Then user clicks on the Add Characteristic link to proceed to the characteristic form
Then user clicks on the data group name dropdown to view available data groups
Then user selects a data group from the dropdown to associate with the characteristic
Then user clicks on the part dropdown to view available parts
Then user selects a part from the dropdown to link with the characteristic
Then user enters the Characteristic Name in the input field
Then user clicks on the add button to confirm the characteristic details
And user enters the Upper Spec value in the specified input field
And user enters the Lower Spec value in the specified input field
Then user enters the Subgroup Size value to define grouping
Then user clicks on the save button to save the characteristic
Then user clicks on action tab to add action
   Then user clicks on add action icon
  Then user enters action name
  Then user clicks on submit button
Then user clicks on Control Chart Preferences to configure chart settings
Then user clicks on the Analysis tab to access analysis options
Then user clicks on the Define Run dropdown to specify run preferences
Then user clicks on the Define Trend Down option for trend configuration
Then user clicks on the save button to save chart preferences
 Then user clicks on alarms and restrictions tab
  Then user clicks on Force action note on out of control or alarm condition checkbox
  Then user cliks on save button to save the alarms settigs
Then user clicks on the close button to exit the configuration page
    
    
    
  #creating parameter Highlight Contents on Entry 06
    
And user clicks on the configuration to access settings
And user clicks on the Add Parameter link to add a new parameter
Then user enters the parameter name for the checkbox field
Then user clicks on the Highlight Contents on Entry checkbox to enable it
Then user clicks on the save button to save the Highlight Contents on Entry parameter
Then user clicks on the close button to exit the parameter configuration

     
   #creating parameter with increment automated para 10
 When user clicks on the Add Parameter link to initiate the parameter creation process
Then user enters the parameter name in the Parameter Name input field
Then user selects the Increment radio button to enable increment automation
Then user clicks on the Go button to proceed with the parameter configuration
Then user enters the prefix value in the Prefix input field
Then user enters the start value in the Start Value input field
Then user enters the increment value in the Increment Value input field
Then user enters the suffix value in the Suffix input field
And user clicks on the Save button to save the increment-automated parameter
Then user clicks on the Close button to finalize and exit the parameter configuration

    
    
    

#Assign para to part
Given the user initiates the parameter addition process by clicking the Files icon01.
When the user clicks the Add icon to begin adding a new parameter01.
Then the user verifies the assignment by clicking the Assign Parameter to Part link01.
And the user views available groups by clicking the Group dropdown01.
Then the user selects the appropriate data group from the dropdown01.
And views available parts by clicking the Part dropdown01.
Then the user selects the part to which the parameter will be added01.
And drags and drops previously used parameters into the part01.
Then the user drags and drops the required parameter into the part01.
And confirms the addition by clicking the Save button01.

Then the user clicks the Assign button to save the parameters.
Then the user completes the process by clicking the Close button01. 



     
 #add sequence
 
 Given the user clicks on the Files button01.
When the user expands the Files menu by clicking the expand button next to the Files icon01.
Then the user selects a group name from the grid by clicking on it01.
And expands the options by clicking the arrow icon01.
Then the user opens the sequence by clicking the Sequence link01.
And accesses additional options by right-clicking on the sequence name01.
Then the user selects Edit Sequence from the context menu01.
And rearranges the characteristics by dragging and dropping them01.
Then the user saves the changes by clicking the Save button01.
And completes the process by clicking the Close button01.
    

    


  

   
