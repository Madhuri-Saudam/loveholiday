package com.loveholidays.pages;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.loveholidays.base.TestBase;

public class OfferSummaryPage extends TestBase {
	
	//PageFactory
		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/header/nav/div/ul/li[1]/a")
	    WebElement homepagetab;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/span")
		WebElement reference;
			

	// Initialisation
		public OfferSummaryPage() {
			
			PageFactory.initElements(driver, this);		
		}
		
		//Actions
		public String ValidateOfferSummaryPageTitle() {
			
			return driver.getTitle();
		}
		
		public String ValidateHotelBookingRef()
		{
			return reference.getText();
		}
		
		public boolean ValidateHomePageTabIsDisplayed() {
			
			return homepagetab.isDisplayed();
		}
		
		public HomePage ValidateClickHomePageTab() {
			
			homepagetab.click();
			return new HomePage();
			
		}
		
	
}
