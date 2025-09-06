Feature: Check user is able to add new address
Scenario: Validate Update Address 
Given address page should open in default browser
When log in to nopcommerce website
And click on my account button
And click on addresses button
And click on add new button 
And enter first name
And enter last name
And enter email address
And enter company
And select country from dropdown
And select state from dropdown
And enter city
And enter address line one
And enter address line two
And enter pincode
And enter phone number
And click on save button
Then new address added successfully