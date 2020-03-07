package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.pages.BasePage;
import com.pages.HelpPage;

public class HelpTest {
	WebDriver driver;
	HelpPage helppage;
	BasePage basepage;
	@BeforeSuite
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

	}
	
	@BeforeTest
	public void Test() {
		driver = new ChromeDriver();
		String url = "https://www.redbus.in/info/redcare";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		helppage=new HelpPage(driver);
		basepage=new BasePage(driver);
	}

	@org.testng.annotations.Test
	public void helpTesting() {
		//basepage.help();
		helppage.closeBtn();//close 
		driver.findElement(By.xpath("//*[@id=\"questionSet\"]/div[1]")).click();
		//helppage.questioneset();
		//*[@id="questionSet"]/div[1]/span[1]
		helppage.phoneNumber();
		helppage.emailId();
		helppage.sharedetails();
		helppage.submitBtn();
	}
}
