package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadNuakari {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.id("usernameField")).sendKeys("lakshmanlucky44343@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Lakshman123@");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Lakshman']")).click();
		Thread.sleep(2000);
		File f=new File("C:\\Users\\L\\Downloads\\");
		Thread.sleep(2000);
		String absolutePath=f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("‪C:\\Users\\L\\Downloads\\LAKSHMANE.pdf");
		
	}

}
