package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.SearchApi;
import starter.service.SearchService;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDefinitions {

    @Steps
    private SearchService searchService;
    @Steps
    private SearchApi searchApi;


    @When("he searches for: {string}")
    public void heSearchesFor(String searchQuery) {
        searchApi.searchBy(searchQuery);
    }

    @Then("he sees the results displayed for {string}")
    public void heSeesTheResultsDisplayedFor(String title) {
        restAssuredThat(response -> response.statusCode(200));
        assertThat(title + " product was not found in search results",
                searchService.findResultByTitle(title).isPresent(), is(true));
    }

    @Then("he does not see the results")
    public void heDoesntSeeTheResults() {
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("detail.error", is(true)));
        restAssuredThat(response -> response.body("detail.message", is("Not found")));
    }

}
