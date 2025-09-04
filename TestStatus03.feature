
@reg

Feature: Testing 

 @reg
  Scenario: Verifying Average Trend Up SPC 
    When user clicks on network icon to verify test 
    Then user clicks on page name for edit 
    Then user clicks on edit icon 

  # Edit chart 01

    When user clicks on date input field
    Then user clicks on time input field
    Then user enters subgroup size for one 
    Then user enters subgroup size for two
    Then user enters subgroup size for three
    Then user enters subgroup size for four
    Then user enters value for highlights on content
    Then user hovers over the highlights on the content field
    Then user clicks on save button for chart1
    Then user fetches the  of the page

  # Edit chart 02

    When user clicks on time2 input field
    Then user enters subgroup size for one for chart2
    Then user enters subgroup size for two for chart2
    Then user enters subgroup size for three for chart2
    Then user enters subgroup size for four for chart2
    Then user fetch the datavalues01 to verify testcase04
    Then user clicks on save2 button for chart2
    Then user fetches the 2 of the page

  # Edit chart 03

    When user clicks on time3 input field
    Then user enters subgroup size for one for chart3
    Then user enters subgroup size for two for chart3
    Then user enters subgroup size for three for chart3
    Then user enters subgroup size for four for chart3
      Then user fetch the datavalues02 to verify testcase04
    Then user clicks on save3 button for chart3
    Then user fetches the 3 of the page

  # Edit chart 04
 
    When user clicks on time4 input field 
    Then user enters subgroup size for one for chart4
    Then user enters subgroup size for two for chart4
    Then user enters subgroup size for three for chart4
    Then user enters subgroup size for four for chart4
      Then user fetch the datavalues03 to verify testcase04
    Then user clicks on save button for chart4
    Then user fetches the  of the page4

  # Edit chart 05
  
    When user clicks on time5 input field
    Then user enters subgroup size for one for chart5
    Then user enters subgroup size for two for chart5
    Then user enters subgroup size for three for chart5
    Then user enters subgroup size for four for chart5
      Then user fetch the datavalues04 to verify testcase04
    Then user clicks on save button for chart5
   Then user clicks on ok button
   Then user select action note from action dropdown
   Then user click on sumbit button

    Then user fetch the staus5 of the page
      Then user fetch the datavalues05 to verify testcase04
