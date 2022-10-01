package DataConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataExample {
	@DataProvider(name = "Naveena")
	public Object[][] dpMethod() {

		Object[][] testData = new Object[2][2];
		testData[0][0] = "username1";
		testData[0][1] = "password1";
		testData[1][0] = "username2";
		testData[1][1] = "password2";

		return testData;

	}

	@Test(dataProvider = "Naveena")
//	@DataProvider(name = "data")
	public void value(String username, String password) {
		System.out.println(username + password);

	}

}
