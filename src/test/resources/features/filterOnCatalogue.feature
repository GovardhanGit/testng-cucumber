Feature: To verify filters on brand

	@Filter
  Scenario: Apply filters on brand name
		Given I am on catalogue page
    Then I select brand ".NET"
    Then I click on apply filter
    Then Catalog should get filtered
