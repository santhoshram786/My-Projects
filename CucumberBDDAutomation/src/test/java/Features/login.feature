Feature: Application login

Scenario: Home Page Login

Given User is in landing Page
When User enterd into application with user credentials
When User enterd into application with user credentials Username "Ram" and Password "12345"
Then Home Page is populated
And Contacts are Displayed "true"

Scenario: Home Page Login

Given User is in landing Page
When User enterd into application with user credentials
When User enterd into application with user credentials Username "Sam" and Password "234ee"
Then Home Page is populated
And Contacts are Displayed "false"