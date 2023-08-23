package seleniumApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseageOfClickonCheckBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	WebElement chickBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	chickBox.click();
	driver.manage().window().minimize();
	driver.quit();
}
}
