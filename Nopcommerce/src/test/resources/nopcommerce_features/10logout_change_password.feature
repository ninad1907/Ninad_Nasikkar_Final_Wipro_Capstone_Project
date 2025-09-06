Feature: Check user is able to change password and logout
Scenario: Validate change password and logout functionality
Given change password page should open in default browser
When login to nopcommerce
And click on my account option
And click on change password
And enter old password
And enter new password
And confirm password
And click on change password button
Then password changed successfully
And click on logout button
Then logged out of nopcommerce