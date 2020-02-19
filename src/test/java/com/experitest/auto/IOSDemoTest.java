package com.experitest.auto;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.experitest.auto.*;

@TestInfo(name="stam", type=TestType.IOS)
public class IOSDemoTest extends TestBase{

	@Test(retryAnalyzer=RetryAnalyzer.class, groups= {"all"})
	public void test() throws Exception {

		Steps.sendKeys("company", "login.usernameTextField", "{'timeout'=20}", context);
		Steps.sendKeys("company", "login.passwordTextField", null, context);
		Steps.click("login.loginButton", null, context);
		//USER_CODE_START
		//USER_CODE_END
	}
}
