package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

	WebDriver Driver;

	public BasePage(WebDriver driver) {
		this.Driver=driver;
	}
	
	@FindBy(xpath="//a[text()='BUS TICKETS']")
	WebElement bustickets;
	
	@FindBy(xpath="//a[text()='rPool']")
	WebElement pool;
	

	@FindBy(xpath="//a[@class='selectedBus site-links gtm-busHire']")
	WebElement bushire;
	
	@FindBy(xpath="//a[contains(text(),'PILGRIMAGES')]")
	WebElement pilgrimages;

	@FindBy(xpath="//div[@id='mytrips']")
	WebElement mytrips;
	

	@FindBy(xpath="//a[contains(text(),'Help')]")
	WebElement help;

	public void bookingsTickets() {
		bustickets.click();
	}
	public void pool() {
		pool.click();
	}
	public void bushire() {
		bushire.click();
		}
	public void mytrips() {
		mytrips.click();
	}
	public void help() {
		help.click();
		}
}
