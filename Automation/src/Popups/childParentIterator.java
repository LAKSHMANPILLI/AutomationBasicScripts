package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childParentIterator {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://demo.actitime.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
	    driver.close();
	    
	}

}
