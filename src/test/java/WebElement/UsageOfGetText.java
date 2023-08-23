package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgotpass = driver.findElement(By.xpath("//a[contains(@href,'facebook_login')]"));
		String tagtext = forgotpass.getText();
		System.out.println("tagtext of anchor :" + tagtext);
		driver.manage().window().minimize();
		driver.quit();
	}
}
