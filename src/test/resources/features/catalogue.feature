Feature: To test catalogue details
    
    @Catalogue
		Scenario: Test catalogue
  	Given Item with name "Cup<T> Sheet" is present on page 3 
    	Then Verify that items price should be "8.50"
    	Then Add item to cart
    	Then Item "Cup<T> Sheet" quantity is updated to "0"
    	Then Continue shopping
    	
    