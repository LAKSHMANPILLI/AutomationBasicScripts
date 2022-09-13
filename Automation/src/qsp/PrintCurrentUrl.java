package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCurrentUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		String Url = driver.getCurrentUrl();
		if (Url.contains("https://www.gmail.com/")){

			System.out.println("Url succussfully navigate and pass");
		}
		else
		{
			System.out.println("Url not Navigate and Failed");
		}
		driver.close();
	}

}
