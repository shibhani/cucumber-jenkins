Feature: Login mercurytour application

 
Background: display welcome
 
Given display welcome page

 
@login @regression
Scenario: login with data credentials
 
When user opens tour application in browser
 
When user entering username as "mercury" And password as "mercury" in field
 
And registered user clicks login
 
Then verify login page


 @regression
Scenario: login with invalid data credentials
 
When user opens tour app in browser
 
When user entering invalid username as "merry" And password as "mercury" in field
 
And clicks login
 
Then verify login application 



