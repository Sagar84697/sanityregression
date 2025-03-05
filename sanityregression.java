package March5;

import org.testng.annotations.Test;

public class sanityregression {
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void login() {
		System.out.println("login");
	}
	
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void logout() {
		System.out.println("logout1");
	}
	
	@Test(priority=1,groups= {"sanity","regression"})
	void openapp() {
		System.out.println("openapp2");
	}

}
