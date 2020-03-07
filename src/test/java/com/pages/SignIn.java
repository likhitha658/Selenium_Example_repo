package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends BasePage{

	public SignIn(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='src']")
	WebElement source;
	
	@FindBy(xpath="//input[@id='dest']")
	WebElement destn;
	
	@FindBy(xpath="//div[@class='clearfix rb-calendar-main']//div[@id='rb-calmiddle']//span[contains(text(),'27')]")
	WebElement calender;
	
	@FindBy(xpath="//div[@class='clearfix rb-calendar-main']//div[@id='rb-calmiddle']//span[contains(text(),'29')]")
	WebElement returncln;
	//button[@class='D120_search_btn searchBuses']
	
	@FindBy(xpath="//button[@class='D120_search_btn searchBuses']")
	WebElement searchbtn;
	
	public void source(String from) {
		source.sendKeys(from);
	}
	
		public void destination(String desty) {
			 destn.sendKeys(desty);
	}
		public void dateClicker() {
			calender.click();
	}
		public void dateSelector( ) {
			 returncln.click();
	}
		public void searchbtn() {
			searchbtn.click();
	}
		
}

