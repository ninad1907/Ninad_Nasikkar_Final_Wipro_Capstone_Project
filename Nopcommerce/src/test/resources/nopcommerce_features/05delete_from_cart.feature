Feature: Check user is able to delete products from cart
Scenario: Validate delete from cart
Given delete from cart page should open in default browser
When Add the product to cart
And Click on shopping cart
And click on remove button
Then product deleted successfully