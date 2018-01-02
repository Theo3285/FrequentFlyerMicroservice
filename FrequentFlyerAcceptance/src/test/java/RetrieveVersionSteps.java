import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class RetrieveVersionSteps implements En {
    public RetrieveVersionSteps() {
        When("^the client calls /version$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^the client receives status code of (\\d+)$", (Integer arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        And("^the client receives server version (\\d+)\\.(\\d+)$", (Integer arg0, Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
