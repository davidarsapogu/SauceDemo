package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SwagLabs_Page {
	
	WebDriver driver;
	
	public SwagLabs_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	WebElement SwagLabsText;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement NameAtoZDropdown;
	
	
	public void selectAtoZdropdown() {
		NameAtoZDropdown.click();
	}
	
	public void priceLowtoHigh() {
		Select lowtoHigh = new Select(NameAtoZDropdown);
		lowtoHigh.selectByVisibleText("Price (low to high)");
	}

}
