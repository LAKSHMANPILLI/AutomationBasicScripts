package Jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/L/OneDrive/Desktop/Hotel.html");
	    WebElement chListBox=driver.findElement(By.id("cp"));
	    Select s=new Select( chListBox);
	    List<WebElement> allOption=s.getOptions();
	   
	    for(WebElement i:allOption)
	    {
	    	String text = i.getText();
	    System.out.println(text);
	    }
	    /*
	    for (int i = 0; i < allOption.size(); i++) {
	    	String text = allOption.get(i).getText();
	    	System.out.println(text);
			
		}
		*/
	    driver.close();
	}

}
