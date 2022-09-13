package Jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement monthListBox=driver.findElement(By.id("month"));
		Select s=new Select(monthListBox);
		Thread.sleep(1000);
		s.selectByIndex(8);
		Thread.sleep(1000);
		s.selectByValue("2");
		Thread.sleep(1000);
		s.selectByVisibleText("Dec");
	}
	

}
