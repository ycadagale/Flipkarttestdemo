package com.flipkart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy (xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement Searchbox;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement Submit;
	
		 

}
