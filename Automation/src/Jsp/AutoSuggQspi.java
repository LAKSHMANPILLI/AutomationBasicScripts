package Jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggQspi {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro");
		Thread.sleep(2000);
		List<WebElement> auto=driver.findElements(By.xpath("//span[contains(text(),'Wipro')]"));
		int count=auto.size();
		System.out.println(count);
	
		for(int i=0;i<count;i++)
		{
			String text = auto.get(i).getText();
		System.out.println(text);
		}
		auto.get(0).click();
	}
}
