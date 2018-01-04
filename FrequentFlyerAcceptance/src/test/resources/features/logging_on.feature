@iteration-1
@authentication
Feature: Logging on to the 'My Flying High' web site
  Frequent Flyer members can register on the 'My Flying High' website
  using their Frequent Flyer number and a password that they provide

  Scenario: Logging on successfully
    When "Joe" logs on with password "secret"
    Then he should be given access to the site

  Scenario: Logging on with an incorrect password
    When "Joe" logs on with password "wrong"
    Then he should be informed that his password was incorrect

  Scenario: Logging on with an expired account
    When "Jill" logs on with password "secret"
    And the account has expired
    Then he should be informed that his account has expired
    And he should be invited to renew his account

