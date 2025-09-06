Feature: Check user is able to add products to cart
Scenario: Validate Add to cart
Given add to cart page should open in default browser
When search for a product
And click on add to cart button
And click on shopping cart button 
Then show the added product