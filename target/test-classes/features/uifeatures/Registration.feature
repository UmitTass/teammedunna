Feature: Test Registrant data

  @NewApplicant
  Scenario Outline: test new applicatn
    Given user provides their ssn id as "<ssn>"
    And user provides their firstname as "<firstname>"
    And user types in their lastname as "<lastname>"
    When user provides the username as "<username>"
    And user types in their email as "<email>"
    When user provides the password as "<password>"
    And user types in their password confirmation as "<passwordconfirm>"
    Then user registers and saves the records

    Examples: test data for applicants
    |ssn|firstname|lastname|username|email|password|passwordconfirm|
    |367-92-2290|Umit|Tas  |umittrfrewfias |umit879rfrf7tas@gmail.com|umitiis49|umitiis49|
    |367-92-2290|Umit|Tas  |umittrfrewfias |umit879rfrf7tas@gmail.com|umitiis49|umitiis49|
    |367-92-2290|Umit|Tas  |umittrfrewfias |umit879rfrf7tas@gmail.com|umitiis49|umitiis49|
    |367-92-2290|Umit|Tas  |umittrfrewfias |umit879rfrf7tas@gmail.com|umitiis49|umitiis49|
    |367-92-2290|Umit|Tas  |umittrfrewfias |umit879rfrf7tas@gmail.com|umitiis49|umitiis49|
