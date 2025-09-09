Feature: Check user is able to register using correct details
Scenario: Validate Registration
Given registration page should open in default browser
When click on register button
And enter the details
And create new password
And click on register
Then open home page