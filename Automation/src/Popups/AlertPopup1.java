package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("(//button)[3]")).click();
		driver.switchTo().alert().
		dismiss();  
	
		String text = driver.findElement(By.xpath("(//p)[1]")).getText();
		System.out.println(text);
		//String f=("you pressed cancel");
		if (driver.getPageSource().contains("You Pressed Cancel")) {
			System.out.println("verified");
		}
		else
		{
			System.out.println("same not");
		}
	}
}