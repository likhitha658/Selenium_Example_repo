package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.pages.BasePage;
import com.pages.SignIn;

public class BookingsTickets {

	public class BookingTickets {
		WebDriver driver;
		BasePage basepage;
		SignIn signin;

		@BeforeSuite
		public void before() {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		}

		
		@BeforeTest
		public void Test() {
			driver = new ChromeDriver();
			String url = "https://www.redbus.in/";
			driver.get(url);
			signin = new SignIn(driver);
			basepage = new BasePage(driver);
		}

		@org.testng.annotations.Test
		public void booking() {
			signin.source("chennai");
		signin.destination("bangalore");
			driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
			WebElement datewibget = driver.findElement(By.xpath(
					"//div[@id='rb-calendar_onward_cal']//tbody"));
			List<WebElement> col = datewibget.findElements(By.tagName("td"));
			for (WebElement cell : col) {
				if (cell.getText().equals("18")) {
					cell.click();
					break;
					
					
				}
			}
			System.out.print("====================>>>>>>>>>>>>>>>"+driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle'][contains(text(),'Mar 2020')]")).getText());
			/*
			 * signin.dateClicker(); signin.dateSelector(); signin.dateSelector();
			 * signin.searchbtn();
			 */
		}

		@AfterTest
		public void aftertest() {
			//driver.close();

		}

	}
}
