package camcastseleniumFRM;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups= "SmokeTest")
	public void createContactTest() {
		System.out.println("contact created");
	}
	
	@Test(groups = "RegressionTest")
	public void createContactWithOrgTest() {
		System.out.println("contact created with org");
	}
	
	@Test(groups= "RegressionTest")
	public void deleteContactTest() {
		System.out.println("contact deleted");
	}
	

}
