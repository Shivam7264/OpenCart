package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_004_Search extends BaseClass{

	// later
	@Test(groups= {"Regression","Master"})
	void runn(){
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(true);
	}
}
