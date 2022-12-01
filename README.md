# Soft Industry homework solution for Serenity and Cucumber framework

Refactoring and configuration of existing sample project to make it meet specified requirements

### The project directory structure
Project is using Maven as a build tool, and follows standard Serenity project structure:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
            post_product.feature
```

## Running tests locally:

To run the sample project, you can either just run the `CucumberTestSuite` test runner class.
Or run scenario directly from the .feature file if your IDE have Cucumber for Java plugin

Also you can run them through command line
```json
$ mvn clean verify -Ddriver=firefox
```

## Generating reports

Generate the report by using command:
```json
$ mvn serenity:aggregate
```

## What have been changed:

post_product.feature changes:
 - Added positive and negative scenarios
 - Positive scenario made as 'Scenario Outline' so it could use same scenario body for multiple search results
 - Search steps are no longer contains full url
 - Step for asserting positive result is now generic instead of hardcoded for each product ones
 - Step for negative result typo fix

Other changes:
 - Removed redundant step definitions
 - Instead of making requests to direct url, created a separate SearchApi instance that contains
 configuration and functionality only related to product search api calls
 - Created BaseApi abstract class that contains basic configuration for all potential api calls
 - Added ApplicationProperties class to fetch properties from serenity.properties file 
 - Created SearchService class that handles all actions related to product search
 - Added SearchResultDTO class for mapping the search results in DTO object, so it would not only be 
easier to work with results, but it also provides contract testing for this endpoint
 - Added gitlab CI/CD configuration






