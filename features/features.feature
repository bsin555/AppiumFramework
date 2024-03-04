Feature: Google Search
  As a web surfer, I want to search Google, so that I can learn new things

  Scenario: Simple Google Search
    Given I want to write a step with precondition
    When the search phrase <searchstring> is entered
    And enter key is pressed
    Then results for <searchstring> are shown

    Examples: 
      | searchstring  | 
      | "Taj Mahal"   |  
      | "Qutub Minar" |
