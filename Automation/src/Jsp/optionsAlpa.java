package Jsp;
import java.util.Collections;
import java.util.List;

import java.util.TreeSet;
//import java.util.ArrayList;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class optionsAlpa {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/L/OneDrive/Desktop/Hotel.html");

		WebElement MtrListBox=driver.findElement(By.id("cp"));
		Select s=new Select(MtrListBox);

		List<WebElement> Options=s.getOptions();
		TreeSet<String>t3=new TreeSet<String>();
		
		for (int i = 0; i <Options.size(); i++) {

			String text=Options.get(i).getText();
			t3.add(text);
			
		}
		for(String k:t3)
		{
			//Collections.sort(t3);
			//String text = k.getText();
			System.out.println(k);
		}
	}
}
