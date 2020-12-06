Feature: To test cart details
    
    @Catalogue
		Scenario: Test cart items
  	Given Item with name "Cup<T> Sheet" is present on page 3 
    	Then Verify that items price should be "8.50"
    	Then Add item to cart
    	Then Item with name "Cup<T> Sheet" is present on cart
    	Then Item "Cup<T> Sheet" quantity is updated to "3"
    	Then Item "Cup<T> Sheet" total cost should be "$ 25.50"  
