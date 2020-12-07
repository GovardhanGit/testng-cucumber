Feature: To login to application

	@Login
  Scenario: Login with valid credentials
		Given I am on login page
    Then I enter valid username
    Then I enter valid password
    Then I click on login button
    Then I am able to login successfully
    Then I logout