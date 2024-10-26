#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: To Test Login Valid and Invalid Credentials


  Scenario: User try to login with valid credentials
    Given user has launched the chrome browser
    When user enter the valid url
    And  user enter the valid username and password
    And  user click on login button
    Then user should navigate to dashboard
    And user should see admin tab


Scenario: user try to logout the OrangeHRM

  