Feature: Demo1

#DataTabels
Scenario: verify Amazon home page
	Then I verify Amazon logo is displayed
	And Search item
	And I search multiple item
		|mobile|
		|headphone|
		|books|	

#Page Factory	
Scenario: Search Item on Amazon
	Then I enter item on search bar
	Then I click submit button

#Scenario Outlines	
Scenario Outline: Search Item
	Then I enter <mobile> in search field
	
	Examples:
	|mobile			|
	|one plus		|
	|Android Phone	|	