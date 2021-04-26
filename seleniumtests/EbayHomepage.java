package com.junt.seleniumtests;

import java.util.concurrent.TimeUnit;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class EbayHomepage {
	
	
	public void ClickDailyDeals()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-p-1"));
		//searchInput = ebayDriver.findElement(By.id("gh-p-1"));

		searchInput.click();
	
		
		//gh-la
		
	}
	
	

	public void ClickLogo()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-la"));

		searchInput.click();
	
	}
	
	public void ClickHelp()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-p-3"));

		searchInput.click();
		
	
	}
	
	public void Clicksignin()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-ug"));

		searchInput.click();//register
	}
	
	public void ClickRegister()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("register"));

		searchInput.click();
	}
	
	public void ClickUsename()
	{
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-ug"));

		 searchInput = ebayDriver.findElement(By.id("userid"));
		searchInput.click();
	
	} 
	
	public void ClickBrandOutlet()
	{
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-p-4"));

		
		searchInput.click();
	
	} // gh-p-2 //gh-p-4
	

	public void ClickSearch()
	{
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-btn"));

		
		searchInput.click();
	
	}
	
   public	void ClickSell()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-p-2"));
				
		searchInput.click();
	
	}
	
	public void ClickMyEbay()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-eb-My"));
				
		searchInput.click();
		
	
	} //gh-shop-a
	
	public void ClickWishList()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.className(" More "));
		searchInput.click(); 
		
		 searchInput = ebayDriver.findElement(By.className("Expand: More "));
		searchInput.click(); 
	} 
	//gh-eb-Alerts
	public void ClickNotificatons()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-eb-Alerts "));
		searchInput.click(); 
		
		
	} ////*[@id="icon-cart-new"]/path
	
	public void ClickShoppingCart()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id(" icon-cart-new "));
		searchInput.click(); 
		
		//gh-eb-Alerts
	} 
	public void ClickShopbycategory()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-shop-a"));
				
		searchInput.click(); 
		////*[@id="mainContent"]/div[1]/ul/li[2]/a
		
	////*[@id="mainContent"]/div[1]/ul/li[1]/span
		
		
	} 
	public void Clicksubcategory()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.id("gh-shop-a"));
		
		searchInput.click(); 
		
		searchInput = ebayDriver.findElement(By.className("gh-sbc-parent"));
				
		searchInput.click(); 
		////*[@id="mainContent"]/div[1]/ul/li[2]/a
		
	////*[@id="mainContent"]/div[1]/ul/li[1]/span
		
		
	} 
	
	public void ClickHome()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.className("hl-cat-nav__active"));
		searchInput.click(); 
	} 
	
	public void ClicSaved()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.className(" saved"));
		searchInput.click(); 
	} 
	
	
	public void ClickMotors()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Motors"));
		searchInput.click();
	}
	
	public void ClickSubMotors()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Motors"));
		searchInput.click();
		
		 searchInput = ebayDriver.findElement(By.linkText("Boats"));
		searchInput.click();

	}
	
	public void ClickFashion()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Fashion"));
		searchInput.click(); 
	} 
	public void ClickSubFashion()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Fashion"));
		searchInput.click(); 
		

		searchInput = ebayDriver.findElement(By.linkText("Watches"));
		searchInput.click(); 
	} 

	
	//Fashion
	
	public void ClickElectronics()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Electronics"));
		searchInput.click(); 
	} 
	public void ClickSubElectronics()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Electronics"));
		searchInput.click(); 
		
		searchInput = ebayDriver.findElement(By.linkText("Laptops"));
		searchInput.click(); 
	
	} 
	
	
	public void ClickCollectablesarts()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Collectibles & Art"));
		searchInput.click(); //Pottery & Glass
		//searchInput = ebayDriver.findElement(By.linkText("Pottery & Glass"));
	}  
	public void ClickSubCollectablesarts()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Collectibles & Art"));
		searchInput.click(); //Pottery & Glass
		
		searchInput = ebayDriver.findElement(By.linkText("Pottery & Glass"));
		searchInput.click(); 
	} 
	public void ClickHomegarden() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Home & Garden"));
		searchInput.click(); 
	} 
	
	public void ClickSubHomegarden() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Home & Garden"));
		searchInput.click(); //Vacuums
		
		 searchInput = ebayDriver.findElement(By.linkText("Vacuums"));
		searchInput.click(); //Vacuums
	} 
	public void ClickSportingGoods()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Sporting Goods"));
		searchInput.click(); 
	} 
	public void ClickSubSportingGoods() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Home & Garden"));
		searchInput.click(); 
		
		searchInput = ebayDriver.findElement(By.linkText("Fishing"));
		searchInput.click(); 
	} 
	
	public void ClickToys()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Toys"));
		searchInput.click(); 
		
		 searchInput = ebayDriver.findElement(By.linkText(""));
		searchInput.click(); 
	} 
	public void ClickSubToys() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Home & Garden"));
		searchInput.click(); 
	 searchInput = ebayDriver.findElement(By.linkText("Outdoor Toys"));
		searchInput.click(); 
	} 
	public void ClickBusinessIndusrial()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Business & Industrial"));
		searchInput.click(); 
		
		
	} 
	public void ClickSubBusinessIndusrial() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Home & Garden"));
		searchInput.click(); 
		 searchInput = ebayDriver.findElement(By.linkText("Healthcare"));
		searchInput.click(); 

	} 

	public void ClickMusic()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Music"));
		searchInput.click(); 
		
		
	} 
	public void ClickSubMusic() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Home & Garden"));
		searchInput.click(); 
		 searchInput = ebayDriver.findElement(By.linkText("Guitars & Basses"));
		searchInput.click(); 
		
	} 
	public void ClickDeals()
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Deals"));
		searchInput.click(); 
		
	}
	public void ClickSubDeals() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Home & Garden"));
		searchInput.click(); 

		 searchInput = ebayDriver.findElement(By.linkText("Fashion Deals"));
		searchInput.click(); 
	} 
	
	public void ClickAboutEbay() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("About eBay"));
		searchInput.click(); //Community

		 
	} 
	public void ClickCommunity() //*[@id="mainContent"]/div[1]/ul/li[7]/a
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Community"));
		searchInput.click(); 

		
	} 
	public void ClickAnnouncements() 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.linkText("Announcements"));
		searchInput.click(); //Community

		 
	} 
	public void ClickVerifyCopyRight() 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.className("gf-legal"));
		searchInput.click(); //Community

		 
	} //See All Deals
	
	public void ClickTodayDeals() 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/swethasharabu/eclipse-workspace/Webdriver/chromedriver89");

		WebDriver ebayDriver = new ChromeDriver();
		ebayDriver.get("https://www.ebay.com");
		
		WebElement searchInput = ebayDriver.findElement(By.xpath("//*[@id=\"items_list1\"]/div[1]/div/div[1]/h2/a"));
		searchInput.click(); //Community

		 
	} //See All Deals
	
}
