Feature: test api registrant data
@GetApiRegistrants
  Scenario:
    Given user sends a get request for users' data
    And user deserializes the useres' data to java
    Then user saves the users' data to correspondent files and validates