package test_member_api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


//with out gerkin language
public class Test_01_GETAllMembers {
	@Test
	void getAllMembers() 
	{
		Response response = RestAssured.get("http://127.0.0.1:5000/members");
		
		System.out.println("whole String body-"+response.asString());
		System.out.println("body-"+response.getBody());
		System.out.println("status code-"+response.getStatusCode());
		System.out.println("status line-"+response.getStatusLine());
		System.out.println("get the perticuler header-"+response.getHeader("content-type"));
		System.out.println("tiem-"+response.getTime());
		
	}
}