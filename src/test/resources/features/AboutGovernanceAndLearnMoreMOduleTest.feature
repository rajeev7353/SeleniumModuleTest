Feature: Multiple module


  Scenario: Verify About, Governance and Learn More module
   Given user is in the homepage
    When user clicks on About menu
    Then user clicks on Governance menu
    Then user should be able to enter on new page
    And user scrolls down the page
    And user clicks on Learn More menu
    Then user should be able to see the Sponsers page