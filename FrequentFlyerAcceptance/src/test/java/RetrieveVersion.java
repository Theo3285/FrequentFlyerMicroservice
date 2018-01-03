import cucumber.api.java8.En;
import org.springframework.http.HttpStatus;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RetrieveVersion extends IntegrationSteps implements En {

    public RetrieveVersion() {
        When("^the client calls /version$", () -> {
            responseEntity = restTemplate.getForEntity(createURL("/version"), String.class);
        });
        Then("^the client receives status code of (\\d+)$", (Integer statusCode) -> {
            assertThat(responseEntity.getStatusCode(), is(HttpStatus.valueOf(statusCode)));
        });
        And("^the client receives server version (\\d+)\\.(\\d+)$", (Integer major, Integer minor) -> {
            assertThat(responseEntity.getBody(), is(major + "." + minor));
        });
    }
}
