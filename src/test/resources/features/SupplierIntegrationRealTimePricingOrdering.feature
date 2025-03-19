@tag
Feature: Integrate with suppliers for real-time pricing and ordering
	@tag1
	Scenario: Fetch real-time ingredient prices from suppliers
		Given the kitchen manager wants to check ingredient prices
		When the system connects to supplier APIs
		Then the system displays real-time prices for the ingredients
	@tag2
	Scenario: Automatically generate purchase orders when stock levels are critically low
		Given an ingredient's stock level is critically low
		When the system detects the low stock level
		Then the system generates a purchase order and sends it to the supplier