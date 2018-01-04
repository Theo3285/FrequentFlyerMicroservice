import cucumber.api.java8.En;

public class RequestMember extends IntegrationSteps implements En {

    public RequestMember() {
        Given("^\"([^\"]*)\" is a Frequent Flyer member$", (String member) -> {
            responseEntity = restTemplate.getForEntity(
                    createURL("/member?name=" + member),
                    String.class);
        });
    }
}
