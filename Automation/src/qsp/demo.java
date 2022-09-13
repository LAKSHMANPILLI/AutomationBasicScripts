package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver h=new ChromeDriver();
	h.get("https://www.amazon.com");
	String title=h.getTitle();
	System.out.println(title);
	h.close();
	}
}