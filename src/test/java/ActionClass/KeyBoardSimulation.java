package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulation {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernamebox = driver.findElement(By.id("username"));
	usernamebox.sendKeys("admin");
	Thread.sleep(5000);
	usernamebox.sendKeys(Keys.TAB+"manager"+Keys.TAB+Keys.TAB+Keys.ENTER);
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
