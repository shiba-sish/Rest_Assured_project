package test_member_api;



import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class Test_01_GETAllMembers_UseStaticImports {
	@Test
	void test_01_getAllMembers() 
	{
//		Response response = RestAssured.get("http://127.0.0.1:5000/members");
		Response response = get("http://127.0.0.1:5000/members");
		
		System.out.println("whole String body-"+response.asString());
		System.out.println("body-"+response.getBody());
		System.out.println("status code-"+response.getStatusCode());
		System.out.println("status line-"+response.getStatusLine());
		System.out.println("get the perticuler header-"+response.getHeader("content-type"));
		System.out.println("tiem-"+response.getTime());
		
	}
	
	//Using Gerkin language static 
	@Test
	void test_02_getAllMembers() {
//		make the imports static
		given().get("http://127.0.0.1:5000/members").then().statusCode(200);
	}
	
	@Test
	void test_02_getMemberById() {
//		make the imports static
		given().get("http://127.0.0.1:5000/members").then().statusCode(200).body("All Members are -.id[0]", equalTo(1)).log().all();
	}
}