Feature: Gmail Login feature
@smoke @sanity
Scenario: Login in to Gmail with valid credentials

Given user is in the login page
When user enter valid username and password
And clicks on signin button
Then sucessfully login should happen
@smoke
Scenario: Login in to Gmail with invalid credentials

Given user is in the login page
When user enter invalid username and password
And clicks on signin button
Then sucessfully login should not happen


