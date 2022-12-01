Feature: Search for the products


  Scenario Outline: Client is able to get results for available products
    Given he searches for: <product>
    And he sees the results displayed for <product>

    Examples:
      | product |
      | "apple" |
      | "mango" |
      | "tofu"  |


  Scenario: Client is not able to get results for products that are not available
    Given he searches for: "car"
    And he does not see the results