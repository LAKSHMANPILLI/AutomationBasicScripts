package Popups;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssaignmentFrame {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://demoqa.com/frames");

		Thread.sleep(2000); 
		List<WebElement> all =driver.findElements (By.xpath("//iframe"));



		int count =all.size();



		System.out.println("count=:"+count); 
		for (int i=0;i<count;i++){

			//int i;
			String Id= all.get(i).getAttribute("id");

			if(Id.equals("frame1")||Id.equals("frame2")) {
				String text =driver.findElement(By.xpath("//h1")).getText(); {


					driver.switchTo().frame(i);

					System.out.println(text); 
					driver.switchTo().parentFrame();
				}



			}
			driver.close();
		}

	}
}


