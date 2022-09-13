package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxCheck {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.get("https://www.google.co.in/");
}
}
