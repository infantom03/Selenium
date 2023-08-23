package testApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleSelector {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("file:///C:/Users/US/Documents/Seleniummultipledropdown.html");
	Select select = new Select(driver.findElement(By.id("cars")));
	select.selectByIndex(0);
	select.selectByIndex(1);
	select.selectByIndex(2);
	select.selectByIndex(3);	
	select.selectByIndex(4);
	if (select.isMultiple()) {
		System.out.println("Boolean Ture and Multiple selecter");
	}
	else {
		System.out.println("Boolean false and single slecter");
	}
	select.deselectByIndex(0);
}
}
