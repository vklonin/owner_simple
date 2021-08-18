package vklonin.tests;

import org.junit.jupiter.api.Test;
import vklonin.configs.APIConfigProvider;

import static io.restassured.RestAssured.given;

public class APITests {
    @Test
    void basicAPITest(){


        System.out.println(APIConfigProvider.getToken());

        given()
                .when()
                    .get(APIConfigProvider.getBaseUrl()+"/get")
                .then()
                    .statusCode(200)
                    .assertThat();
    }

}
