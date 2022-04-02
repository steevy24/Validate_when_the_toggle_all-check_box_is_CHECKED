package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;

import util.BrowserFactory;

public class DashBoardPageTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToCreateCustomer() {

		driver = BrowserFactory.init();

		
		
		 DashBoardPage dashboardPage = PageFactory.initElements(driver,DashBoardPage.class);
		 
		 dashboardPage.verifyDashboardHeader();
	
		 dashboardPage.clickToggleAllButton();
		  
		 
	}
}
