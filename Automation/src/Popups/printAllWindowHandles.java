package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllWindowHandles {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		Set<String>allwh=driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		for (String string : allwh) {
			System.out.println(string);
		}
		for(String tit:allwh)
		{
			driver.switchTo().window(tit);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		driver.quit();
	}
}
