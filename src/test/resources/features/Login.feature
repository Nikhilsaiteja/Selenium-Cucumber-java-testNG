Feature: Login page test cases

  Background:
    Given Login page is opened

  Scenario: Login with valid credentials
    Given Entered valid email and password
    When Clicked on Login Button
    Then Dashboard page should be displayed