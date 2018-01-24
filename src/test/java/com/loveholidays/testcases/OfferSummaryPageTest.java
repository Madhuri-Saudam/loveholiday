package com.loveholidays.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.loveholidays.base.TestBase;
import com.loveholidays.pages.HomePage;
import com.loveholidays.pages.OfferSummaryPage;

public class OfferSummaryPageTest extends TestBase {

	OfferSummaryPage offersummarypage;
	HomePage homepage;
	
	public OfferSummaryPageTest() {
		
		super();
	}
	
 @BeforeMethod
 public void setUp() {
	 
	 Initialization();
	 offersummarypage = new OfferSummaryPage();
 }
	
 @Test
 public void offerSummaryPageTest() {
	 
	 
		 
	 String title = offersummarypage.ValidateOfferSummaryPageTitle();
	 Assert.assertEquals(title , "loveholidays");
	 String str = offersummarypage.ValidateHotelBookingRef();
	 
	 boolean flag = offersummarypage.ValidateHomePageTabIsDisplayed();
	 Assert.assertTrue(flag);
	 
	 offersummarypage.ValidateClickHomePageTab();
	 
	 //homepage.switchWindowToHome();
		 
	boolean f= homepage.ValidateReturnToOfferTitle();
	Assert.assertTrue(f);
	 
	 boolean f1 = homepage.ValidateClickLatestPriceIsDisplayed();
	 Assert.assertTrue(f1);
	 	 
	 homepage.ClickLatestPrice();	 
	 String title1 = offersummarypage.ValidateOfferSummaryPageTitle();
	 Assert.assertEquals(title1 , "loveholidays"); 
	 Assert.assertEquals(offersummarypage.ValidateHotelBookingRef(), str);
		
	 
	 
 }
 
  
 @AfterMethod
 public void tearDown() {
	 
	 driver.quit();
 }
 
	
}
