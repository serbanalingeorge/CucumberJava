@done
Feature: Google search
Scenario Outline: 
	Given User is on Google page
	When User enters <text> in search field 
	And User clicks Search button
	Then User click <result> link

	Examples: 
		| text        | result               |
		| "Cucumber"  | "Cucumber"           |
		| "Gherkin"   | "Gherkin"            |
		| "WebDriver" | "Selenium WebDriver" |