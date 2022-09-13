package Popups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisor1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("143");
		driver.findElement(By.id("alternative_number")).sendKeys("1234567890");
		driver.findElement(By.id("dob")).click();
		WebElement a = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(a);
		List<WebElement> b = s.getAllSelectedOptions();
		s.selectByIndex(5);
		Thread.sleep(1000);
		//.....................................

		WebElement c =driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(c);
		List<WebElement> d = s1.getAllSelectedOptions();
		Thread.sleep(1000);
		s1.selectByValue("1999");

		Thread.sleep(1000);
		//'''''''''''''''''''''''''''''

		WebElement e=driver.findElement(By.xpath("//a[text()='1']"));
		e.click();
		Thread.sleep(1000);

	     driver.findElement(By.id("renew_policy_submit")).click();
		String text ="Please enter valid Policy No.";
		System.out.println(text);
		
		if (driver.getPageSource().contains("Please enter valid Policy No.")) {
			System.out.println("verified");
		}
		else
		{
			System.out.println("not same");
		}
		driver.close();
		

	}
}


