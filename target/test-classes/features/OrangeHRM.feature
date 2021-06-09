Feature: Verify valid login (positive test), invalid login (negative test) 

Background: 
	Given user is at the login page 
	
Scenario: Succesful login and verify message 
	When user enters a valid name and password 
	And user clicks on login button 
	Then user should be able to verify dashboard text 
	
Scenario Outline: verify invalid login 
	When user enters "<username>" and "<password>" and click login 
	Then user should be able to verify invalid text 
	
	Examples: 
		| username | password     |
		| user1    | admin123     |
		| Admin    | blankusername|