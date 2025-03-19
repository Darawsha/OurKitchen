@tag
Feature: Track available ingredients and suggest restocking

	@tag1
	Scenario: Track ingredient stock levels in real time
		Given the kitchen manager is logged into the system
		When ingredients are used or added
		Then the system updates the stock levels in real time
		
	@tag2
	Scenario: Suggest restocking when ingredients are low
		Given the system is monitoring ingredient stock levels
		When an ingredient falls below the predefined threshold
		Then the system suggests restocking the ingredient to the kitchen manager