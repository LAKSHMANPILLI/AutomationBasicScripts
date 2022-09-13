package Scroll;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBBC {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(1000);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		j.executeScript("window.ScrollBy(0,3000)");
	}
}
