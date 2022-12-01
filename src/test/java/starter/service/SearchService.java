package starter.service;

import io.restassured.common.mapper.TypeRef;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.model.SearchResultDTO;

import java.util.List;
import java.util.Optional;

public class SearchService {

    public List<SearchResultDTO> getLatestSearchResults() {
        return SerenityRest
                .lastResponse()
                .as(new TypeRef<List<SearchResultDTO>>() {
                });
    }

    @Step("Searching for {0} in the latest search results")
    public Optional<SearchResultDTO> findResultByTitle(String title) {
        return getLatestSearchResults()
                .stream()
                .filter(result -> result.getTitle().contains(title))
                .findFirst();
    }

}
