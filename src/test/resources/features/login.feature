Feature: To login to application

	@Login
  Scenario: Login with valid credentials
		Given I am on login page
    Then I enter username "admin@microsoft.com"
    Then I enter password "Pass@word1"
    Then I click on login button
    Then I am able to login successfully