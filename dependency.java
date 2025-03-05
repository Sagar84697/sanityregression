package March5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {
	
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods={"openapp"})
	void login() {
		Assert.assertTrue(false);
	}
	@Test(priority=3, dependsOnMethods= {"openapp","login"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority=4)
	void logout() {
		Assert.assertTrue(true);
	}



}
