Feature: Check user is able to add product to wishlist
Scenario: Validate add to wishlist function
Given product page should open in default browser
When search a product
And click on the add to wishlist icon
And click on Wishlist option
Then display products in the wishlist