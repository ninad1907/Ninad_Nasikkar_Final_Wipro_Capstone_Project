Feature: Check user is able to login with valid credentials
Scenario: Validate Login
Given login page should open in default browser
When click on login button
And enter the email address
And enter password
And click on login 
Then open new webpage