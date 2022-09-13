package Jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement DlistBox=driver.findElement(By.id("day"));
		Select s=new Select(DlistBox);
		Thread.sleep(1000);
		s.selectByIndex(0);
		WebElement MlistBox=driver.findElement(By.id("month"));
	    
		Select k=new Select(MlistBox);
		Thread.sleep(1000);
		k.selectByValue("6");
		WebElement YlistBox=driver.findElement(By.id("year"));
	     Select g=new Select(YlistBox);
		Thread.sleep(1000);
		g.selectByVisibleText("1999");
		driver.close();
	}

}
