package test_member_api;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Test_04_GetAndPostEx {

	@Test
	void test_02_getAllMembers() {
//		make the imports static
		given().get("http://127.0.0.1:5000/members").then().statusCode(200)
		.body("All Members are -.name[0]",equalTo("raj"))
		.body("All Members are -.name",hasItems("raj"))
		.log().all();
	}
	
	@Test
	public void AddnewMember() 
	{
//		HashMap<String , Object> map = new HashMap<String, Object>();
//		map.put("name", "mark");
//		map.put("email", "mark@gmail.com");
//		map.put("designation", "fresher");
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
 		request.put("name", "mark");
 		request.put("email", "mark@gmail.com");
 		request.put("designation", "fresher");
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when().
		post("http://127.0.0.1:5000/member")
		.then()
		.statusCode(200).log().all();
	}
}
