package Popups;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framehandle1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//driver.switchTo().frame("(//iframe)[5]");
		Thread.sleep(1000);
		WebElement a = driver.findElement(By.xpath("(//iframe)[5]"));
		//Actions a=new Actions(null, null);
		String b = a.getText();
		System.out.println(b);
		
	}
	

}
