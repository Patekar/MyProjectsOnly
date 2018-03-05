Feature: Register user on IMDb	
  
  Scenario: Register user on IMDb 
    Given I am on Homepage
    When I click on <Other Sign in options>
    And I click on <Create a New Account>
	  And filling the registration form
    Then I verify that newly registered user is able to login to the application
    When I click LogOut from the application
    Then I verify user's logout state.
  