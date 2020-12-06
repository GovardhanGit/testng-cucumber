Feature: To search cucumber in google
@ignore
    Scenario: Cucumber Google
      Given I am on "google" search page
      When I type "cucumber"
      Then I click search button
      Then I clear search textbox
