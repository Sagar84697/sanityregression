package March5;

import org.testng.annotations.Test;

public class regression {
	
	@Test(priority=1,groups= {"regression"})
	void login() {
		System.out.println("login");
	}
	
	@Test(priority=1,groups= {"regression"})
	void logout() {
		System.out.println("logout");
	}
	
	@Test(priority=1,groups= {"regression"})
	void openapp() {
		System.out.println("openapp");
	}

}
