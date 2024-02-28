Feature: Login into Gmail with excel data 

Scenario Outline: Login in to Gmail with valid credentials

Given user is in the login page
When user entered login credential from <rownum>
And clicks on signin button
Then sucessfully login should happen

Examples:
|rownum|
|2|
|3|
|4|
|5|
|6|
|7|
