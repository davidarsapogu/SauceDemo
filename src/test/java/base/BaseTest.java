package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import page.Login_Page;
import page.SwagLabs_Page;

public class BaseTest {
	
	public WebDriver driver;
	
	//Crate Objects\Variables for Every Page
	public Login_Page login;
	public SwagLabs_Page swaglog;
	
	@BeforeClass
	public void navigateBrowser() {
		
		driver = new ChromeDriver(); //open Chrome
		driver.get("https://www.saucedemo.com/"); //Navigate TO WebSite
		driver.manage().window().maximize(); 
		login = new Login_Page(driver);
		swaglog = new SwagLabs_Page(driver);
		
		//Login
		login.typeUserName("standard_user");
		login.typePassword("secret_sauce");
		login.clickLoginButton();
		
		
		
	}
	
	@AfterClass
	public void closeBrowser() {
//		driver.quit();
	}

}
