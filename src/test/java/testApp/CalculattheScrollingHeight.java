package testApp;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculattheScrollingHeight {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	long scrollheight =(long) jse.executeScript("return document.body.scrollHeight");
	System.out.println("scrollheight "+scrollheight);
	long scrollwidth=(long)jse.executeScript("return document.body.scrollWidth");
	System.out.println("scrollwidth "+scrollwidth);
}
}
