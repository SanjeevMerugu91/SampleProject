@sanity
Feature: Create an account in Timejobs portal using datatable

Scenario: create an account

Given user is in the register page
When user enter following details
|srinivas|Narayan|
|srinivas.narayan97@gmail.com|9972278770|
And click on register button
Then account should be create sucessfully