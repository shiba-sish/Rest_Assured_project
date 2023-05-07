package test_member_api;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test_06_Delete 
{
	@Test
	public void testDeleteFunctinality() {
		
		given()
		.when()
		.delete("http://127.0.0.1:5000/member/8")
		.then()
		.statusCode(200)
		.log()
		.all();
	}
}

