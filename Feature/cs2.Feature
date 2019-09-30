Feature: Register using Para
	Scenario Outline: to login to TestMeApp
		
		Given home page is opened
		When user enters details
		And user clicks on register button
		Then user goes to homepage
		
Examples:
  |userName |
	|lalaitha |
	|Alex@123 |
	|AlexUser |