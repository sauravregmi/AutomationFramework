@Color
Feature: Validate Background scenario

@Scenario1
Scenario: Sky Blue Background
     Given "Set SkyBlue Background" button exits
     Then "Set SkyBlue Background" after user clicks on the button
     Then the background color will change to sky blue
	
	@Scenario2
Scenario: Set  White Background 
     Given "Set white Background" button exits
     Then "Set white Background" after user clicks on the button
     Then the background color will change to white
	