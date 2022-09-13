package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/L/OneDrive/Desktop/QJDemo.html");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		WebElement link=links.get(1);
		String text=link.getText();
		System.out.println(text);
		//driver.close();

}
}
