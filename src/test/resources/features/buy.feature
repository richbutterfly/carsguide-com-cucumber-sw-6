Feature: Search functionality
  As a user, I want to search for different new and used cars from carsguide website

  Background: I open chrome browser
    Given  I am on homepage
    When   I mouse hover on “buy+sell” tab
    And    I select make “<make>”
    And    I select model “<model>”
    And    I select location “<location>”
    And    I select price “<price>”
    And    I click on Find My Next Car tab

  @sanity
  Scenario Outline: Search the buy car with model
    When I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I should see the make “<make>” in results
    Examples: :
  |make   |model  |location       |price    |
  |Audi   |A4     |NSW-Newcastle  |$40000   |
  |BMW    |X1     |VIC-Melbourne  |$35000   |
  |Ford   |Puma   |SA-South       |$25000   |
  |Honda  |Fit    |WA-Country East|$30000   |
  |Nissan |Cube   |NSW-All        |$45000   |
  |Lexus  |GS300H |NSW-Sydney     |$50000   |

  @smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'Used' link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make “<make>”
    And I select model “<model>”
    And I select location “<location>”
    And I select price “<price>”
    And I click on Find My Next Car tab
    Then I should see the make “<make>” in results
    Examples: :
  |make   |model  |location       |price    |
  |Audi   |A4     |NSW-Newcastle  |$40000   |
  |BMW    |X1     |VIC-Melbourne  |$35000   |