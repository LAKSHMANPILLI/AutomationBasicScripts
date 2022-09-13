package Popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fileUplodPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/L/Downloads/file.html");
		File f=new File("C:\\Users\\L\\Downloads");
		String Absolute = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\L\\Downloads\\Harish10.pdf");
		//driver.close();
	}
}
