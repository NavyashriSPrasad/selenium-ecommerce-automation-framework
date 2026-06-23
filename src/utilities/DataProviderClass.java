package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="loginData")
    public Object[][] getData() {

        Object[][] data = {

            {"standard_user","secret_sauce"},
            {"locked_out_user","secret_sauce"},
            {"problem_user","secret_sauce"}

        };

        return data;
    }
}
