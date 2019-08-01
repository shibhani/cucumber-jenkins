Feature: TestMeApp Registration
Description: User has to register in TestMeApp
Scenario: Register with valid data
Given user opens signup page in testmeapp
Then enter the valid username as "kshflkndsfnksnh"
Then enter the first name as "Chan" and lastname as "Cibi"
Then enter the password as "Cibi" And  reenter to confirm the password as "Cibi"
Then select the gender as male
Then enter the valid email "chancibi007@gmail.com" And  mobile number as "8939633617"
Then select the date of birth as "18/08/1998"
Then enter the complete address "Perungalathur"
Then select the security question as birthplace And enter the answer as "Chennai" 
And click on Register button
