package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernamebox = driver.findElement(By.id("username"));
		usernamebox.sendKeys("admin");
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		Thread.sleep(5000);
		WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Login ']"));
		loginbutton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
