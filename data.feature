User Story:
"As an administrator, I want to add a new data group so that I can categorize data efficiently."

Acceptance Criteria:

The user should be able to navigate to the "Add Data Group" page.
The user must enter a valid data group name.
Clicking the "Add" button should successfully create the group. 
If the data group already exists, an error message should appear.

	Tester’s Perspective (Writing Cucumber Feature File)
A tester writes the feature file in Gherkin syntax to cover all acceptance criteria.

gherkin
Copy
Edit
Feature: Add Data Group  
  As an administrator  
  I want to add a new data group  
  So that I can categorize data efficiently  

Scenario: Successfully adding a new data group  
  Given the user is on the home page  
  When the user clicks on the add link  
  And the user clicks on add data group  
  And the user enters a unique data group name  
  Then the user clicks on the add button  
  And the data group should be created successfully  

Scenario: Adding a duplicate data group  
  Given the user is on the home page  
  When the user clicks on the add link  
  And the user clicks on add data group  
  And the user enters an existing data group name  
  Then the user clicks on the add button  
  And an error message should be displayed  
  
📌 Why is this useful?
✅ Ensures business expectations are met.
✅ Covers positive and negative scenarios.
✅ Helps developers and testers stay aligned.


3️⃣ Developer’s Perspective (Step Definitions Implementation - Java)
The developer implements the automation logic in Java using Selenium.

java
Copy
Edit
@Given("the user is on the home page")
public void user_is_on_home_page() {
    driver.get("https://example.com/home");
}

@When("the user clicks on the add link")
public void user_clicks_add_link() {
    homePage.clickAddLink();
}

@When("the user clicks on add data group")
public void user_clicks_add_data_group() {
    homePage.clickAddDataGroup();
}

@When("the user enters a unique data group name")
public void user_enters_data_group_name() {
    addGroupPage.enterGroupName("NewGroup123");
}

@Then("the user clicks on the add button")
public void user_clicks_add_button() {
    addGroupPage.clickAddButton();
}

@Then("the data group should be created successfully")
public void data_group_created_successfully() {
    Assert.assertTrue(addGroupPage.isSuccessMessageDisplayed());
}
📌 Why is this useful?
✅ Connects business logic with automation scripts.
✅ Ensures step definitions match feature file scenarios.
✅ Helps developers quickly implement automation scripts.User Story:
"As an administrator, I want to add a new data group so that I can categorize data efficiently."

Acceptance Criteria:

The user should be able to navigate to the "Add Data Group" page.
The user must enter a valid data group name.
Clicking the "Add" button should successfully create the group. 
If the data group already exists, an error message should appear.

	Tester’s Perspective (Writing Cucumber Feature File)
A tester writes the feature file in Gherkin syntax to cover all acceptance criteria.

gherkin
Copy
Edit
Feature: Add Data Group  
  As an administrator  
  I want to add a new data group  
  So that I can categorize data efficiently  

Scenario: Successfully adding a new data group  
  Given the user is on the home page  
  When the user clicks on the add link  
  And the user clicks on add data group  
  And the user enters a unique data group name  
  Then the user clicks on the add button  
  And the data group should be created successfully  

Scenario: Adding a duplicate data group  
  Given the user is on the home page  
  When the user clicks on the add link  
  And the user clicks on add data group  
  And the user enters an existing data group name  
  Then the user clicks on the add button  
  And an error message should be displayed  
  
📌 Why is this useful?
✅ Ensures business expectations are met.
✅ Covers positive and negative scenarios.
✅ Helps developers and testers stay aligned.


3️⃣ Developer’s Perspective (Step Definitions Implementation - Java)
The developer implements the automation logic in Java using Selenium.

java
Copy
Edit
@Given("the user is on the home page")
public void user_is_on_home_page() {
    driver.get("https://example.com/home");
}

@When("the user clicks on the add link")
public void user_clicks_add_link() {
    homePage.clickAddLink();
}

@When("the user clicks on add data group")
public void user_clicks_add_data_group() {
    homePage.clickAddDataGroup();
}

@When("the user enters a unique data group name")
public void user_enters_data_group_name() {
    addGroupPage.enterGroupName("NewGroup123");
}

@Then("the user clicks on the add button")
public void user_clicks_add_button() {
    addGroupPage.clickAddButton();
}

@Then("the data group should be created successfully")
public void data_group_created_successfully() {
    Assert.assertTrue(addGroupPage.isSuccessMessageDisplayed());
}
📌 Why is this useful?
✅ Connects business logic with automation scripts.
✅ Ensures step definitions match feature file scenarios.
✅ Helps developers quickly implement automation scripts.