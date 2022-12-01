package starter.api;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

import static starter.configuration.ApplicationProperties.getBaseUrl;

public abstract class BaseApi {

    abstract public RequestSpecification getSpec();

    protected RequestSpecification getBaseSpec() {
        return SerenityRest.given()
                .baseUri(getBaseUrl());
    }
}
