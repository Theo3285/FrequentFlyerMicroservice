import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.List;
import java.util.Map;

public class CreateMembers extends IntegrationSteps implements En {


    public CreateMembers() {
        Given("^some Frequent Flyer member:$", (DataTable dataTable) -> {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            List<Map<String, String>> members = dataTable.asMaps(String.class, String.class);
            HttpEntity<List<Map<String, String>>> request = new HttpEntity<List<Map<String, String>>>(members, headers);

            responseEntity = restTemplate.postForEntity(createURL("/members"), request, String.class);
        });
    }
}
