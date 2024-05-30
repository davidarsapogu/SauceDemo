package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='user-name']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passWord;
	
	@FindBy(xpath = "//input[@name='login-button']")
	WebElement loginButton;
	
	public void typeUserName(String uname) {
		userName.sendKeys(uname);
}
	
	public void typePassword(String pword) {
		passWord.sendKeys(pword);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

	
}