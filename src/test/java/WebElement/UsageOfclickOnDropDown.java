package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfclickOnDropDown {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement mobiletextfield = driver.findElement(By.name("reg_email__"));
		Thread.sleep(5000);
		mobiletextfield.click();
		WebElement Monthtextfield = driver.findElement(By.id("month"));
		Monthtextfield.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
