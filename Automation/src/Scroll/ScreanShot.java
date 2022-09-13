package Scroll;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreanShot {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com/");
	     TakesScreenshot t=(TakesScreenshot) driver;
	     File s=t.getScreenshotAs(OutputType.FILE);
	     File d=new File("C:\\Users\\L\\Downloads\\g.png");
	     Files.copy(s, d);
	     driver.close();
	}
	

}
