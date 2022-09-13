package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class veryfyLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo=driver.findElement(By.xpath("//img[@alt='facebook']")).isDisplayed();
		if(logo==true)
		{
			System.out.println("logo is Displayed");

		}
		else 
		{
			System.out.println("logo is Not Displayed");
		}
	}


}
