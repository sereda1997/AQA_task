package infrastructure;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.matchesXsd;
import static org.hamcrest.core.IsEqual.equalTo;

public class RequestUtils {
    public static File file = new File("C:\\Users\\yser\\IdeaProjects\\AQA_Keepit_task\\src\\main\\java\\infrastructure", "schema.xsd");

    static RequestSpecification requestSpec = new RequestSpecBuilder()
            .setAccept(ContentType.XML)
            .setAuth(RestAssured.basic("automation@keepitqa.com", "password"))
            .build();


    public static void verifySchemaAndElements(String guid) {
        given().spec(requestSpec)
                .when()
                .get("https://ws-test.keepit.com/users/" + guid)
                .then().log().ifError()
                .assertThat()
                .body(matchesXsd(file));
    }

    public static void verifyIfAllElements(String guid) {
        given().filter(new AllureRestAssured())
                .spec(requestSpec)
                .when()
                .get("https://ws-test.keepit.com/users/" + guid)
                .then().log().ifError()
                .assertThat()
                .and().body("user.created", equalTo("2019-02-28T13:07:49Z"))
                .and().body("user.product", equalTo("7dwqnq-5cvrcm-1z3ehj"))
                .and().body("user.parent", equalTo("80ltks-yhfls5-24zyf2"))
                .and().body("user.enabled", equalTo("true"));
    }
}
