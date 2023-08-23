package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagName {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailtextfield = driver.findElement(By.id("email"));
	String tagname = emailtextfield.getTagName();
	System.out.println(" tagname of emailtextfield :"+ tagname);
	driver.manage().window().minimize();
	driver.quit();
}
}
