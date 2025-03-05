package March5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sanity {
	
	@Test(priority=1,groups= {"sanity"})
	void login() {
		System.out.println("login");
	}
	
	@Test(priority=1,groups= {"sanity"})
	void logout() {
		System.out.println("logout");
	}
	
	@Test(priority=1,groups= {"sanity"})
	void openapp() {
		System.out.println("openapp");
	}
	
}
