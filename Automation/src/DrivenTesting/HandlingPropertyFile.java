package DrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		//FileInputStream fis=new FileInputStream("C:\\Users\\L\\Downloads\\Comman.Property");
		FileInputStream fis=new FileInputStream("./Data/Comman.property");
		Properties p=new Properties();
		p.load(fis);
		String rl = p.getProperty("Url");
		String un=p.getProperty("Username");
		String pwd=p.getProperty("Password");
		driver.get(rl);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		//System.out.println(rl);
		//System.out.println(un);
		//System.out.println(pwd);
	}

}
