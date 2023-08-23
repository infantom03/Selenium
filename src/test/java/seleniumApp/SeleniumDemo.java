package seleniumApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.in/");
		Thread.sleep(5000);
		WebElement loginOpetion = driver.findElement(By.linkText("Login/Enrol"));
		Thread.sleep(5000);
		loginOpetion.click();
	}
}
