@smoke @homepage @muneer
Feature: To verify we have three panels on the home page
Scenario: Verify panels on the home page
Given user is on page
When user clicks on login
Then user is able to see "HR Login" "SuperAdminLogin" "InternLogin"
