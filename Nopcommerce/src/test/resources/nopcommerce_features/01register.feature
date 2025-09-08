Feature: Check user is able to register using correct details
Scenario: Validate Registration
Given registration page should open in default browser
When click on register button
And enter the details
And create new password
And click on register
And click on continue
Then open home page