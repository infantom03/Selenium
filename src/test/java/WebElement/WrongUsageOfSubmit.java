package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	//unsupportedoperationException - run - unchecked - selenium
	loginButton.submit();
	driver.manage().window().minimize();
	//driver.quit();
}
}
