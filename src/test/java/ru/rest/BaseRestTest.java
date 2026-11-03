package ru.rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.latest.network.model.Request;
import ru.rest.post.Posts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BaseRestTest {

    @BeforeEach
    public void setUp(){
        RestAssured.baseURI= "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void myRestTest(){
       /* String json = """
                {
                   "id": 1,
                   "title": "Test",
                   "body": "Test",
                   "userId": 1
                }
               
                """;
        */

        Posts  posts =  new Posts(100L, "Test", "Test", 2L);
        Posts result =  given().contentType(ContentType.JSON)
                .body(posts)
                .when()
                .post("/posts")
                         .then()
                         .statusCode(201)
                .log().all()
                .extract().as(Posts.class);
                 given().contentType(ContentType.JSON)

                .body(posts)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                         .body("title", equalTo("Test"))
                .log().all().body("id", equalTo(101)); //body - проверяет данные ответа поля JSON фактически и актуальный результат

        System.out.println(result);

        RequestSpecification specification = given().contentType(ContentType.JSON)
                .body(posts);
                given().spec(specification);




    }
}
