@bendigoBank
  Feature: Navigate with demo Bank
    Rule : Test Demo Bank from Kuspi Exam

  Background: Visit bank demo
    Given to visit bank demo
    When select launch personal demo

  #  Scenario Outline: select each menu option
  #  Then select <menu> from demo bank
  #    And log Off demo bank
  #    Examples:
  #     | menu     |
  #     |accounts  |
  #     |move_money|
  #     |activity  |
  #     |contacts  |
  #     |cards     |
  #     |fx        |
  #     |setting   |
  #     |change_log|

 # @bendigoVerifyTitle
 #   Scenario Outline: Verify accounts spelled
 #     Given select <menu> from demo bank
  #    Then comparate account title
  #    Examples:
  #       | menu     |
  #       |accounts  |

    @NewPayee
   Scenario Outline: create a new payee contact
      Given select <menu> from demo bank
      Then select pay anyone
       And click new Payee and BSB and account Number
      Then complete formulary New Payee
      And sent payment to new payee
      Examples:
        | menu     |
        |move_money|