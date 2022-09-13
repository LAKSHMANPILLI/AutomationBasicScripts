package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
	static void testK(WebDriver driver)
	{
		ChromeDriver driver2=new ChromeDriver();
		driver2.get("https://www.vtiger.com/");
		String title=driver2.getTitle();
		System.out.println(title);
		driver2.close();
		}
	}

