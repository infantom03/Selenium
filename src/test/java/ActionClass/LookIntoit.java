package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LookIntoit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement loginbutton = driver.findElement(By.name("login"));
	//create a object of action class
	Actions action =new Actions(driver);
	//action.click(loginbutton).perform();
	action.moveToElement(loginbutton).click().perform();
	WebElement button = driver.findElement(By.id("loginbutton"));
//	action.pause(2000).contextClick(button).perform();
	action.moveToElement(button).contextClick().perform();
	driver.manage().window().minimize();
	driver.quit();
}
}
