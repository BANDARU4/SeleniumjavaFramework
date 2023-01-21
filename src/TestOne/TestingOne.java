package TestOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingOne 
{

	public static void main(String args[])
	{
		System.out.println("Welcome");
		System.setProperty("webdriver.gecko.driver", "D:\\software\\BrowserDrivers\\geckodriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("//div[a[@class=\"gb_m\"]][1]")).click();
		
		
	}
	
}
