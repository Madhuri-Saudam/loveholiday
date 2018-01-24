package com.loveholidays.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.loveholidays.base.TestBase;

public class HomePage extends TestBase{
	
	
	TestBase testbase;
	//PageFactory
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div/div/div[3]/div/div/div/div[1]")
	WebElement stillinterestedinholiday;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div/div/div[3]/div/div/div/div[2]/div[3]/a")
	WebElement clicklatestprice;
	
	
	// Initialization
	public HomePage() {
		
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String ValidateHomePageTitle() {
		System.out.println(driver.getTitle());
		
		return driver.getTitle();
	}
	
	public boolean ValidateReturnToOfferTitle() {
		
		return stillinterestedinholiday.isDisplayed();
	}
	
	public boolean ValidateClickLatestPriceIsDisplayed() {
		
		return clicklatestprice.isDisplayed();
	}
	
	public OfferSummaryPage ClickLatestPrice() {
		
		clicklatestprice.click();
		return new OfferSummaryPage();
	}

	
}
