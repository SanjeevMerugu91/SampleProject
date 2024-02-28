@reg
Feature: Login into Gmail 

Scenario Outline: Login in to Gmail with valid credentials

Given user is in the login page
When user entered valid username as <Name> and password as <password>
And clicks on signin button
Then sucessfully login should happen

Examples:
|Name|password|
|Name1|password1|
|Name2|password2|
|Name3|password3|
|Name4|password4|
|Name5|password5|
|Name6|password6|
|Name7|password7|
