package camcastseleniumFRM.copy;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test(groups= "SmokeTest")
	public void createOrgTest() {
		System.out.println("org created");
	}
	
	@Test(groups = "RegressionTest")
	public void createOrgWithIndustriesTest() {
		System.out.println("org created with Ind");
	}
	
	@Test(groups = "RegressionTest")
	public void deleteOrgTest() {
		System.out.println("org deleted");
	}
	

}
