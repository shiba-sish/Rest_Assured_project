package test_member_api;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;
import java.util.HashMap;


public class Test_05_putexample {
	
	@Test
	public void testUpdateFunctinality() {
		
		JSONObject request = new JSONObject();
 		request.put("name", "hari");
 		request.put("email", "hari@gmail.com");
 		request.put("designation", "HR manager");
 		
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when().
		put("http://127.0.0.1:5000/member/8")
		.then()
		.statusCode(200)
		.log().all();
	}
}
