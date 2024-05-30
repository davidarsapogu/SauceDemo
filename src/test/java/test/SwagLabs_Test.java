package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.SwagLabs_Page;

public class SwagLabs_Test extends BaseTest {
	
	SwagLabs_Page swagobj = new SwagLabs_Page(driver);
	
	@Test
	public void swagLabTestCases() {
			
		
		//SwagLabs Assertion
		String expectedText = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		String actualText = "Swag Labs";
		
		
		//Assertion
		Assert.assertEquals(expectedText,actualText);
				
		//Conditional Statement
		if(expectedText.equals(actualText)) {
			System.out.println("Successfully Landed On SwagLabs Home Page");
		}
		else {
			System.out.println("Failed Navegating SwagLabs Page");
		}
	
		
		//Select dropdown Filter - Low to High
		swaglog.selectAtoZdropdown();
		swaglog.priceLowtoHigh();
		
		
	}

}
