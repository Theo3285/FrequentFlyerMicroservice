import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Authenticate extends IntegrationSteps implements En {
    public Authenticate() {
        And("^\"([^\"]*)\" has registered online with a password of \"([^\"]*)\"$", (String member, String password) -> {
            responseEntity = restTemplate.getForEntity(createURL("/members?name="+member+"&password="+password), String.class);
        });
        When("^\"([^\"]*)\" logs on with password \"([^\"]*)\"$", (String member, String password) -> {
            responseEntity = restTemplate.getForEntity(createURL("/members?name="+member+"&password="+password), String.class);
        });
        Then("^he should be given access to the site$", () -> {
            assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));
        });
        Then("^he should be informed that his password was incorrect$", () -> {
            assertThat(responseEntity.getBody(), is("Incorrect Password"));
        });
        Given("^the account has expired$", () -> {
            assertThat(responseEntity.getBody(), is("Account has expired"));
        });
        Then("^he should be informed that his account has expired$", () -> {
            assertThat(responseEntity.getBody(), is("Account has expired"));
        });
        And("^he should be invited to renew his account$", () -> {
            assertThat(responseEntity.getBody(), is("Renew your password"));
        });
    }
}
