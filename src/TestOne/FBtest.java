package TestOne;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class FBtest 
{

	public static void main(String[] args) 
	{
		System.out.println("Loading");
		System.setProperty("webdriver.chrome.driver", "D:\\software\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement about=driver.findElement(By.xpath("//a[text()='About']"));
		/*
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
		WebElement firstname=driver.findElement(By.name("firstname"));
		
		firstname.sendKeys("welcome");
		
		/*WebElement drop=driver.findElement(By.xpath("[@id='day']"));
		
		Select se=new Select(drop);
		
		se.selectByIndex(5);
		se.selectByValue("Monday");
		se.selectByVisibleText("Friday");
		se.getOptions();
		se.getFirstSelectedOption();
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		alt.dismiss();
		
		WebElement frame1=driver.findElement(By.xpath("[@id='frame1']"));
		
		driver.switchTo().frame(frame1);
		
		driver.switchTo().defaultContent();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		
	/*	WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(null));
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView()");
		
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		alt.dismiss();
		
		Actions act=new Actions(driver);
		
		WebElement firstname2=driver.findElement(By.xpath("//input[@id='firstname']"));
		
		act.click(firstname2);
		
		act.doubleClick().perform();
		
		act.contextClick().perform();
		
		act.moveToElement(firstname2).perform();
		
		driver.findElement(By.tagName("a"));
		
		act.dragAndDrop(firstname, firstname2).perform();
		
		Actions Act1=new Actions(driver);
		
		*/
		
		/*String actual=driver.getTitle();
		String expected="Facebook – log in or sign up";
		
		Assert.assertEquals(actual, expected);*/
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView()", about);
		
		WebElement drop1=driver.findElement(By.xpath("//input[@id='day']"));
		
		Select se=new Select(drop1);
		
		se.selectByIndex(5);
		
		List<WebElement> li=se.getOptions();
		
		li.size();
		for(WebElement we:li)
		{
			we.getText();
		}
	
	}

}
