import com.frequentflyer.FrequentFlyerApplication;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@SpringBootTest(classes = FrequentFlyerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationSteps {
    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();
    ResponseEntity<String> responseEntity;

    public String createURL(String uri) {
        return "http://localhost:" + port + uri;
    }
}
