package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage extends BasePage{

	

		public HelpPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//i[@class='icon-close']")
		WebElement closeBtn;

		@FindBy(xpath = "//span[contains(text(),'I need help with offers and promotions')]")
		WebElement quries;

		@FindBy(xpath = "//span[contains(text(),'I need help with offers and promotions')]")
		WebElement questioneset;

		@FindBy(xpath = "//input[@placeholder='Enter your phone number']")
		WebElement phoneNumber;

		@FindBy(xpath = "//input[@placeholder='Enter your email id']")
		WebElement emailId;

		@FindBy(xpath = "//textarea[@placeholder='Share the details']']")
		WebElement sharedetails;

		@FindBy(xpath = "//button[@class='submitBtn']")
		WebElement submitBtn;

		public void closeBtn() {
			closeBtn.click();
		}

		public void quries() {
			quries.click();
		}

		public void questioneset() {
			questioneset.click();
		}

		public void phoneNumber() {
			phoneNumber.sendKeys("7702828488");
			;
		}

		public void emailId() {
			emailId.sendKeys("burle@gmail.com");
			
		}

		public void sharedetails() {
			sharedetails.sendKeys("good service");
			
		}

		public void submitBtn() {
			submitBtn.click();
		}

	}

