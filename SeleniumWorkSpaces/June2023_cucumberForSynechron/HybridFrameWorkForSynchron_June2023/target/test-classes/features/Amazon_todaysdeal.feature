Feature: Add an item to cart for Todaysdeal

Scenario Outline: Add an item to cart from furniture department

Given user is in the department page
When user select <checkbox> department and select item to add
And clicks on add2cart button
Then sucessfully an item to be added to the cart
Examples:
|checkbox|
|furniture|
|menswatches|
|MovieAndTv|
