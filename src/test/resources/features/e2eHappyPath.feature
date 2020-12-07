Feature: To test end to end flow
    
    @e2e
		Scenario: Test the end to end functionality
  	Given I am logged in to application
  	Then I add product '.NET Bot Black Sweatshirt' to basket
  	Then I click on continue shopping
  	Then I add product 'Prism White T-Shirt' to basket
  	Then I click on checkout
  	Then I click on pay now
  	Then I verify order is placed successfully
  	
  	
