package com.junt.seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSearch {

	

		public void ClickFindItem() throws InterruptedException
		{
		
			System.setProperty("webdriver.chrome.driver",
					"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

			WebDriver ebayDriver = new ChromeDriver();
			ebayDriver.get("https://www.ebay.com");
			
			WebElement searchInput = ebayDriver.findElement(By.id("gh-as-a"));
			searchInput.click();//_ex_kw
			
			Thread.sleep(1000);
			
			searchInput = ebayDriver.findElement(By.xpath("//*[@id='_nkw']"));//search for iphone on finditem 
			searchInput.sendKeys("iphone");
			 
			
			
			searchInput = ebayDriver.findElement(By.xpath("//*[@id='LH_TitleDesc']"));
			searchInput.click();
			
			searchInput = ebayDriver.findElement(By.xpath("//*[@id='adv_search_from']/fieldset[1]/div[3]/button"));
			searchInput.click();
			
		}
		
		
			
		}
	

