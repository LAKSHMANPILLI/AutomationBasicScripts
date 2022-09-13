package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverVtiger {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.vtiger.com/");
	    
	     WebElement link = driver.findElement(By.partialLinkText("Resources"));
	     Actions a=new Actions(driver);
	     a.moveToElement(link).perform();
	     
	     driver.findElement(By.partialLinkText("Customers")).click();
	     WebElement dclick = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
	     Actions b=new Actions(driver);
	     b.doubleClick(dclick).perform();
	     
	     if (driver.getPageSource().contains("HackerEarth + Vtiger CRM")) {
				System.out.println("page is Displayed");
			}
			else
			{
				System.out.println("not displayed");
			}
			driver.close();
			
	}

}
