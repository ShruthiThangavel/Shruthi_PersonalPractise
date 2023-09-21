Feature: AdvanceSearch to Ebay login

  @P2
  Scenario: The user navigates back to Ebay home
    Given The user in advance search page
    When The user clicks home button
    Then The user navigates from advance search to home page

  @P6
  Scenario: The user advance searches samsung  mobile
    Given The user in advance search page
    When The user enters the value and performs advance search
      | keyword | minPrice | maxPrice |
      | samsung |      300 |      900 |
