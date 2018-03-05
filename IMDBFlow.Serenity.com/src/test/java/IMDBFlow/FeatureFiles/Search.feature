Feature: To Check Search features
	
  Scenario: Keyword Search from IMDb homepage
  		Given The "<browser>" is opened
  		And I am on HomePage
    When selecting <Most Popular TV Shows> in <Movies, TV, & ShowTime’s> 
	  And Click on "<Link>"
    Then I verify that creator name is "<creator>" in results
