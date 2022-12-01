package starter.api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SearchApi extends BaseApi {

    @Override
    public RequestSpecification getSpec() {
        return getBaseSpec()
                .basePath("/api/v1/search/test/");
    }

    public Response searchBy(String query) {
        return getSpec()
                .get(query);
    }
}
