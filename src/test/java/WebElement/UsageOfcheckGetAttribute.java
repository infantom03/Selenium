package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfcheckGetAttribute {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement forgotpass = driver.findElement(By.linkText("Forgotten password?"));
	String hrefattvalue = forgotpass.getAttribute("href");
	System.out.println("hrefattvalue is :"+hrefattvalue);
	driver.manage().window().minimize();
	driver.quit();
}
}
