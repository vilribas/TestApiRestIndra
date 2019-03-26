package testeapiresteassuredindra.testeindra;

import static org.junit.Assert.*;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import org.junit.Test;

public class testeApiRest {

	public testeApiRest() {
		
		
		baseURI = "https://jsonplaceholder.typicode.com/todos/1";
		
	}
	
	@Test
	/*Chama o serviço pelo metodo POST*/
	public void testeApiIndra() {
		String myJson = "{\"userId\":\"id\",\"title\": \"completed\"}";
    	
         given()
           .contentType("application/json")
    	   .body(myJson)
    	 .when()
    	   .post("/")
    	 .then()
    	   .statusCode(200)
    	   .body("message", containsString("false"));	 
	}
}
