package Jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/L/OneDrive/Desktop/Hotel.html");
	    WebElement mtrListBox=driver.findElement(By.id("mtr"));
	    Select s=new Select( mtrListBox);
	    List<WebElement> allOption=s.getOptions();
	    //List<WebElement> allOptions;
		int count=allOption.size();
		System.out.println(count);
		for (WebElement webElement : allOption) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		driver.close();
		
	}
	   

}
