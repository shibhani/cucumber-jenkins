Feature: Login  application
Background: display Welcome message
Given Welcome message 


Scenario Outline: login by using valid data credentials
When user clicks chrome browser and opens application
When user entering username as "<Credentials>" And  password in "<password>"
And user logs in by clicking on signin button
Then  login is verified




Examples: 
|Credentials|password|
|mercury|mercury|
#|merry|mercury|