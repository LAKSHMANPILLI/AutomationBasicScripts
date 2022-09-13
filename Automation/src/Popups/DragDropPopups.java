package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropPopups {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		WebElement srs = driver.findElement(By.id("box1"));
		WebElement dest = driver.findElement(By.id("dropBox"));
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		a.dragAndDrop(srs, dest).perform();
		driver.close();
	}

}
