Feature: Free CRM Login Feauture

Scenario Outline: Free CRM Login test scenario

Given The user is on a login page
When Title is free CRM
Then User enter "<username>" and "<password>" 
Then User click login button
Then User must be on home page

Examples: | username | password |
					| thatomadub | thato123 |
					| thato | thato1 |